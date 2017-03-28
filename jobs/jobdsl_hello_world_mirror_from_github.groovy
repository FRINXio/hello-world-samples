def inputGitUrl = 'https://github.com/FRINXio/hello-world-samples.git'
def outputGerritProjectName = 'hello-world-samples'
def outputGitUrl = 'ssh://admin@$GERRIT_FQDN:29418/' + outputGerritProjectName
def createOutputProject = true
def branchPrefix = ''
def restrictedByLabel = 'docker-agent'
def inputCredentialsId = ''
def outputCredentialsId = 'root'

job('dsl-hello-world-mirror-from-github') {
    label(restrictedByLabel)
    scm {
      git {
        remote {
          name('origin')
          url(inputGitUrl)
          credentials(inputCredentialsId)
        }
      }
    }
    triggers {
        scm('@daily')
    }
    wrappers {
        sshAgent(outputCredentialsId)
    }  
    steps {
        shell(
(createOutputProject?
'curl --user admin:passwd -v -X PUT http://$GERRIT_FQDN/a/projects/' + outputGerritProjectName:'')
+
'''
ssh-keyscan -t rsa -p 29418 -H $GERRIT_FQDN >> ~/.ssh/known_hosts
git remote rm downstream | true
git remote add downstream ''' + outputGitUrl + '''

for branch in $(git for-each-ref --format='%(refname)' refs/remotes/origin/); do
  LOCAL_BRANCH_NAME=${branch#refs/remotes/origin/}
  git checkout -B ''' + branchPrefix + '''${LOCAL_BRANCH_NAME} ${branch}
done
git push --all downstream
'''			)
    }
}
