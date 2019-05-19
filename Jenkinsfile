pipeline {
    agent any
    stages {
        stage("master") {
            steps {
                echo "========executing A========"
                sh "mvn -DskipTests clean package"
            }
        }
        stage("deploy") {
            steps {
                echo "========executing release========"
                sh "mvn -DskipTests release:prepare"
                sh "mvn -DskipTests release:perform"
            }
        }

    }
}