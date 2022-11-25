# Docker Notes
### Docker web link
https://get.docker.com/
### install docker
```
#! /bin/bash
apt-get update
curl -fsSL https://test.docker.com -o test-docker.sh
sh test-docker.sh
```
### delete all thing
```
docker rm -f $(docker ps -aq)
docker system prune -af
```
```
2  docker run --name=mydb -d -e MYSQL_ROOT_PASSWORD=sandeep mysql:5
3  docker container ls
4  docker run -d --name mywordpress -p 8888:80 --link mydb:mysql wordpress
5  docker container ls
6  docker inspect mywordpress
7  docker rm -f $(docker ps -aq)
8  docker system prune -af
9  docker run --name=myjenkins -d -p 5050:8080 jenkins/jenkins
10  docker run --name=qaserver --link=myjenkins -d  -p 6060:8080 tomee
11  docker run --name=prodserver --link=myjenkins -d  -p 7070:8080 tomee
12  docker container ls
13  docker rm -f $(docker ps -aq)
14  docker system prune -af
15  init 0
16  cd
17  docker run --name=myjenkins -d -p 5050:8080 jenkins/jenkins
18  docker run --name=prodserver --link=myjenkins -d  -p 7070:8080 tomee
19  docker run --name=qaserver --link=myjenkins -d  -p 6060:8080 tomee
20  docker container ls
21  docker rm -f $(docker ps -aq)
22  docker system prune -af
23  history
24  docker run --name=mydb -d -e MYSQL_ROOT_PASSWORD=sandeep mysql:5
25  docker container ls
26  docker run --name=ap -p 9090:80 --link mydb:mysql httpd
28  docker rm -f $(docker ps -aq)
29  docker system prune -af
30  docker run --name=mydb -d -e MYSQL_ROOT_PASSWORD=sandeep mysql:5
31  docker run --name=ap -d -p 9090:80 --link mydb:mysql httpd
32  docker run -d --name=php --link mydb:mysql --link ap:httpd php:7.2-apache
33  docker container ls
34  docker inspect php

```
