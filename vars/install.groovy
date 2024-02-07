def call() {
    // Run build script or command
    sh 'npm run build'
}

def call() {
    // Run npm install
    sh 'npm install'
}

def call() {
    // Run test script or command
    sh 'npm test'
}
