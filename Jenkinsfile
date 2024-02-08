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
                    install.prerequisite()
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    install.build()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    install.test()
                }
            }
        }
    }
}
