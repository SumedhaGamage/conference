#!/bin/bash
yum update -y
docker_bin=$(which docker)
if [[ $? != 0 ]];
then
    yum install docker
fi
service docker start
docker swarm init
docker stack deploy -c stack.yml mongo
#pass varko35
#user root
#45.79.152.69

yum install maven -y
mvn -DskipTests clean package docker:build
docker run -d -p 80:8080 --link mongo sgamage/api
