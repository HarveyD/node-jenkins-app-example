// def call() {
//     // Run build script or command
//     sh 'npm run build'
// }

// def call() {
//     // Run npm install
//     sh 'npm install'
// }

// def call() {
//     // Run test script or command
//     sh 'npm test'
// }



def call() {
    // Define the commands to install dependencies, build, and test your Node.js application
    sh 'npm install'
    sh 'npm run build'
    sh 'npm test'
}

