pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Starting...'
        sh 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing...'
        sh 'mvn test'
        junit '**/target/surefire-reports/TEST-com.example.haufe.test.HelloTest.xml'
      }
    }
  }
}
