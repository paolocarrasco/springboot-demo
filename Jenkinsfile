pipeline {

    agent any

    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }

        stage('clean') {
            steps {
                sh 'sh ./gradlew clean'
            }
        }
    }
}