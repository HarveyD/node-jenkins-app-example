def prerequisite() {
    
        // Run npm install
        sh 'npm install'
    
}

def build() {
    
        // Run npm start
        sh 'npm start &'
    
}

def test() {
    
        // Run npm test
        sh 'npm test'
    
}

return this
