pipeline {
   agent any 
   environment {
       PATH = "C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin;"
            stages {
                stage('Build') {
                    steps {
                        echo 'Hello World'
                        git branch: 'main', credentialsId: 'c45dba1b-fa10-46ad-b046-4dd784dc3575', url: 'https://github.com/Streetlogix/Streetlogix-GIS4-Tests.git'
                        sh 'katalonc.sh -retry=0 -testSuitePath="Test Suites/Work Orders" -executionProfile="default" -browserType="Chrome"'
                    }
                }
            }
   }
}
