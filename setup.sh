#!/bin/bash
yum update -y
docker_bin=$(which docker)
if [[ $? != 0 ]];
then
    yum install docker
fi
#pass varko35
#user root
#45.79.152.69

yum install maven -y
mvn -DskipTests clean package docker:build

service docker start
docker swam leave
docker swarm init
docker stack deploy -c stack.yml conference
