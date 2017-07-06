pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Test') {
      steps {
        parallel(
          "Chrome": {
            sh 'mvn test'
            junit '**/test-results.xml'
            
          },
          "Firefox": {
            sh 'mvn test'
            junit '**/test-results.xml'
            
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