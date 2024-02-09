@Library('xyz') _

pipeline {
    agent any
    tools {
        nodejs 'Node-Build'
    }
    stages {
        stage('prerequisite') {
            steps {
                script {
                    echo "abc_branch"
                    install.prerequisite()
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo "abc_branch"
                    install.build()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "abc_branch"
                    install.test()
                }
            }
        }
    }
}
