pipeline{
    agent any
    tools {
        maven 'apache-maven-3.0.1'
    }
    stages{
        stage("sandbox"){
            steps{
                echo "========executing A========"
                withMaven(maven : '3.6.1'){
                    sh 'mvn -DskipTests clean compile'
                }
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
        stage("dev"){
            steps{
                echo "====++++executing dev++++===="
            }
            post{
                always{
                    echo "====++++always++++===="
                }
                success{
                    echo "====++++dev executed succesfully++++===="
                }
                failure{
                    echo "====++++dev execution failed++++===="
                }
        
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}