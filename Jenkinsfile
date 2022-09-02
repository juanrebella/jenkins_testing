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
                                sh 'docker run -it --rm 6007021/nginx-testing1 sh -c "ls"'
                        }
                }
                stage('Post-Testing') {
                        steps {
                                sh 'exit'
                        }
                   }

                }
}
