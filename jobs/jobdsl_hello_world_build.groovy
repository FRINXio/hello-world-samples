def gitUrl = 'ssh://admin@gerrit:29418/hello-world-samples'
def restrictedByLabel = 'docker-agent'
def inputCredentialsId = 'root'


Map branchesToAltRepos = [
  'beryllium/release':'"release::default::http://nexus/repository/maven-releases"',
  'beryllium/development':'"snapshot::default::http://nexus/repository/maven-snapshots"',
]

branchesToAltRepos.each {branchName,altRepo->
  job('dsl-hello-world-' + branchName.replaceAll('/','_')) {
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
  -Ddocker_registry_address_with_slash=nexus.localhost:8082/
  help:effective-pom deploy 
  -P docker 
  -DaltDeploymentRepository=''' + altRepo)
        providedGlobalSettings('MyGlobalSettings')
      }
    }
  }
}
