pipeline {
    agent any
    stages {
        stage('Clone Repository & Clean') {
            steps {
                sh "mvn clean"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                sh "mvn package"
            }
        }
        stage('Archving') {
            steps {
                archiveArtifacts '**/target/*.jar'
            }
        }
    }
}
