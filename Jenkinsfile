#!/usr/bin/env groovy
pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('package') {
            steps {
                echo 'Building the application'
                sh 'mvn clean package'
            }
        }
    }
}
