pipeline{
        agent any

        stages {

                stage('Build') {

                        steps {
                                 sh 'docker build -t 6007021/nginx-testing1 .'
                        }
                }

                stage('Testing') {

                        steps {
                                sh 'docker exec -it -rm 6007021/nginx-testing1 sh -c ip address'
                        }
                }
                stage('Post-Testing') {
                        steps {
                                sh 'exit'
                        }
                   }

                }
}
