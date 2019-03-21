#!/bin/bash
yum update -y
docker_bin=$(which docker)
if [[ $? != 0 ]];
then
    yum install docker -y
    service docker start
else
    docker kill $(docker ps -q)
fi

docker-compose_bin=$(/usr/local/bin/docker-compose version)
if [[ $? != 0 ]];
then
    sudo curl -L "https://github.com/docker/compose/releases/download/1.23.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
    sudo chmod +x /usr/local/bin/docker-compose
fi

mvn_bin=$(which mvn)
if [[ $? != 0 ]];
then
    yum install maven -y
fi
mvn -DskipTests clean package docker:build
/usr/local/bin/docker-compose up
