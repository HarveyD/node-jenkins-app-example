def call() {
    // Run npm install
    sh 'var/lib/docker/volumes/jenkins_home/_data/tools/jenkins.plugins.nodejs.tools.NodeJSInstallation/Node-Build/bin/npm install'
}
