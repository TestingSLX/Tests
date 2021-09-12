pipeline {
   agent any 
   stages {
       stage('Build') {
            steps {
               try {
                 dir('C:/Users/shrut/Desktop/Katalon/Katalon_Studio_Engine_Windows/Katalon_Studio_Engine_Windows_Files')
                 echo 'Hello World'
//                  git branch: 'main', credentialsId: 'c45dba1b-fa10-46ad-b046-4dd784dc3575', url: 'https://github.com/Streetlogix/Streetlogix-GIS4-Tests.git'
                 sh 'katalonc.sh -retry=0 -testSuitePath="Test Suites/Work Orders" -executionProfile="default" -browserType="Chrome"'
               }
               catch(Exception e){
                  echo 'Failure lol'
               }
            }
       }
   }
}
