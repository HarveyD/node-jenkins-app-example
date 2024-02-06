
// def prerequisite() {
    
//         // Run npm install
//         sh 'npm install'
    
// }

// def build() {
    
//         // Run npm start
//         sh 'npm start &'
    
// }

// def test() {
    
//         // Run npm test
//         sh 'npm test'
    
// }

// return this
// }


// Define a function to execute npm commands
def executeNpmCommand(String command) {
    // Check if the 'npm' command exists in PATH
    def npmCommandExists = sh(returnStdout: true, script: 'command -v npm').trim()

    if (!npmCommandExists) {
        error('npm command not found. Please ensure npm is installed and available in the PATH environment variable.')
    }

    // Execute the npm command
    sh "npm ${command}"
}

// Define a function to install prerequisites
def prerequisite() {
    // Run npm install
    executeNpmCommand('install')
}

// Define a function to build
def build() {
    // Run npm start
    executeNpmCommand('start &')
}

// Define a function to run tests
def test() {
    // Run npm test
    executeNpmCommand('test')
}

// Return the shared code object
return this
