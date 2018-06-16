pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deliver') {
            steps {
                echo 'Delivery'
                sh './jenkins/scripts/deliver.sh' 
            }
        }
    }

}
