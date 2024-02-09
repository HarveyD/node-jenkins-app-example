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
                    echo "Patch1 branch"
                    install.prerequisite()
                    
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo "Patch1 branch"
                    install.build()
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "Patch1 branch"
                    install.test()
                }
            }
        }
    }
}
