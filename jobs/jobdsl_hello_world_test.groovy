def gitUrl = 'ssh://admin@$GERRIT_FQDN:29418/hello-world-samples'
def restrictedByLabel = 'docker-agent-test'
def inputCredentialsId = 'root'


Map branchesToAltRepos = [
  'beryllium/release':'"release::default::http://$NEXUS_FQDN/repository/maven-releases"',
]

branchesToAltRepos.each {branchName,altRepo->
  job('dsl-hello-world-test-' + branchName.replaceAll('/','_')) {
    label(restrictedByLabel)
    scm {
      git {
        remote {
          name('origin')
          url(gitUrl)
          credentials(inputCredentialsId)        
        }
        branch(branchName)
      }
    }
    triggers {
      scm('* * * * *')
    }
    steps {
      maven{
        goals('''
  -B 
  help:effective-pom deploy 
  -DaltDeploymentRepository=''' + altRepo)
        providedGlobalSettings('MyGlobalSettings')
      }
    }
  }
}
