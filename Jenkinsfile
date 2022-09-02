pipeline{
        agent any

        stages {

                stage('Build') {

                        steps {
                                 sh 'docker build -t 6007021/nginx-test .'
                        }
                }

                stage('Testing') {

                        steps {
                                sh 'ip address'
                        }
                }
                stage('Post-Testing') {
                        steps {
                                sh 'exit'
                        }
                   }

                }
}
