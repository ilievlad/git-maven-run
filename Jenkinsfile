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
        sh 'mvn test'
        junit '**/target/surefire-reports/TEST-com.example.haufe.test.HelloTest.xml'
      }
    }
  }
}