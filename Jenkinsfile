def gv

pipeline{
        agent any

        stages {
                
                stage("Init"){
                        steps {
                                script {
                                        gv = load "script.groovy"
                                 }
                                }
			    }	
                stage("Build") {

                        steps {
                                script {
                                        gv.buildApp()
                                }
                        }
                }

                stage("Testing") {

                        steps {
                                script {
                                        gv.testApp()
                                }
                        }
                }
                stage("Post-Testing") {
                        steps {
                                script {
                                        gv.deployApp()
                                }
                        }
                   }

                }

}
