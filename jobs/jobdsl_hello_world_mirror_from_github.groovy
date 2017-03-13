/*
 * This is a Job DSL script that manages jenkins job responsible for
 * mirroring hello-world-samples repository from github to SBE's gerrit.
 * Usage: Create jenkins new project named 'jobdsl-github'.
 * In SCM, enter URL https://github.com/FRINXio/hello-world-samples.git
 * and Branch Specifier beryllium/development .
 * In Build, click Add build step: Process Job DSLs, keep option
 * Look on Filesystem and enter: 
 * jobs/*.groovy
 * Save and build the project.
 */

def inputGitUrl = 'https://github.com/FRINXio/hello-world-samples.git'
def outputGerritProjectName = 'hello-world-samples'
def outputGitUrl = 'ssh://admin@gerrit:29418/' + outputGerritProjectName
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
        scm('* * * * *')
    }
    wrappers {
        sshAgent(outputCredentialsId)
    }  
    steps {
        shell(
(createOutputProject?
'curl --user admin:passwd -v -X PUT http://gerrit:8080/a/projects/' + outputGerritProjectName:'')
+
'''
ssh-keyscan -t rsa -p 29418 -H gerrit >> ~/.ssh/known_hosts
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
