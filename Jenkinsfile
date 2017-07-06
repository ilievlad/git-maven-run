pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn validate'
      }
    }
    stage('Test') {
      steps {
        parallel(
          "Chrome": {
            sh 'mvn test'
            junit '**/target/surefire-reports/*'
            
          },
          "Firefox": {
            sh 'mvn test'
            junit '**/target/surefire-reports/*'
            
          }
        )
      }
    }
    stage('Deploy') {
      steps {
        sh 'scp'
      }
    }
  }
}
