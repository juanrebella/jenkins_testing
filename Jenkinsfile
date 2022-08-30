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
                                sh 'docker run -p 5050:5050 -d 6007021/nginx-test'
                        }
                }

        

            }
           }
