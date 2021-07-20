def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}

pipeline {
  agent {
    node{
      label 'master'
      customWorkspace "workspace/${env.JOB_NAME}"
    }
  }
  triggers {
    cron 'H/1 15 * * * '
  }
  tools {
  maven 'maven-3.6.3'
  
  }
  options {
    buildDiscarder(logRotator(artifactDaysToKeepStr: '30', artifactNumToKeepStr: '5', daysToKeepStr: '30', numToKeepStr: '5'))
  }
  stages {
    stage('Jira-ID Check') {
      steps {
        script {
          echo "To check the Jira story ID"
          }
        }
      }
    stage('Build') {
      steps {
        script {
          cmd_exec( "npm install")
          stash includes: '*', name: 'sourceCode'
        }
      }
    }
    stage('Unit Test') {
      steps {
        script {
          cmd_exec('npm test' )
        }
      }
    }
  }
  post {
    always {
      cleanWs deleteDirs: true
      dir("${env.WORKSPACE}@tmp") {
        deleteDir()
      }
      emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
        recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
        to: "jayasankar.boddu@gmail.com,${env.BUILD_USER_EMAIL}",
        subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
    }
  }
}
