pipeline{
	agent any

        stages {

                stage('Build') {

                        steps {
                                 sh 'docker build 6007021/nginx-test .'
                        }
                }

                stage('Testing') {

                        steps {
                                sh '"Testing App"'
                        }
                }

        

            }
           }
