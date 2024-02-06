def call() {
    // Run test script or command
    sh 'var/lib/docker/volumes/jenkins_home/_data/tools/jenkins.plugins.nodejs.tools.NodeJSInstallation/Node-Build/bin/npm test'
}
