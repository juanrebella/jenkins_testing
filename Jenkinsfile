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

                stage('Pushing to the sky') {

                        steps {
                                docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                                app.push("${env.BUILD_NUMBER}")
                                app.push("latest")
                        }
                }
        

            }
           }
          }
