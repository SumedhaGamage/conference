pipeline{
    agent any
    stages{
        stage("sandbox"){
            steps{
                echo "========executing A========"
                rtMaven.run pom: 'pom.xml', goals: 'clean install'
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