def prerequisite() {
    sh 'npm install'
}

def build() {
    sh 'npm start &'
}

def test() {
    sh 'npm test'
}

return this
