def buildApp() {
    echo 'building the application...'
    sh "docker build -t nacho:nacho ."
}

def testApp() {
    echo 'testing the application...'
}

def deployApp() {
    echo 'deploying the application...'
    echo 'deploying version 1.0.0'
}

return this
