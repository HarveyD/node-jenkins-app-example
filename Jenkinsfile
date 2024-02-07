@Library('shared') _

pipeline {
    agent any
    tools {
        nodejs 'Node-Build'
    }
    stages {
        stage('prerequisite') {
            steps {
                script {
                    prerequisite()
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    build()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    test()
                }
            }
        }
    }
}
