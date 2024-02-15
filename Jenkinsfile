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
                    echo "master branch"
                    install.prerequisite()
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo "master branch"
                    install.build()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "master branch"
                    install.test()
                }
            }
        }
    }
}
