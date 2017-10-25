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
        stage('check') {
            steps {
                sh 'sh ./gradlew check'
            }
        }
        stage('assemble') {
            steps {
                sh 'sh ./gradlew assemble'
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
            }
        }
    }
}