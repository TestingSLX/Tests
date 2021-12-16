pipeline {
   agent any 
   stages {
      stage('Test') {
         steps {
              echo 'Hello World'
//               git branch: 'main', credentialsId: 'c45dba1b-fa10-46ad-b046-4dd784dc3575', url: 'https://github.com/Streetlogix/Streetlogix-GIS4-Tests.git'
              bat('cd "C:/Users/shrut/Desktop/Katalon/Katalon_Studio_Engine_Windows" && katalonc -noSplash -runMode=console -projectPath="%WORKSPACE%/Streetlogix-GIS4-Tests-Portland.prj" -retry=0 -testSuitePath="Test Suites/Work Orders" -executionProfile="default" -browserType="Chrome" -apiKey="42c2bc68-24f4-46e7-b59e-5658c614dbfd" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true')
         }
      }
   }
}
