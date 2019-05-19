pipeline{
    agent any
    stages{
        stage("master"){
            steps{
                echo "========executing A========"
                sh "mvn clean package"
                sh "mvn release:prepare"
                sh "mvn release:perform"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
        }

}