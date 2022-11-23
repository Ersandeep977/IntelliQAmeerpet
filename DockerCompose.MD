![](https://quintagroup.com/cms/technology/Images/docker-compose-button.jpg)
## Docker-compose file Example
### Command
```
# vim docker-compose.yml
# docker compose up -d
# docker compose stop
# docker compose down
```
### Postgres
```
---
version: '3.8'
services:
  mydb:
    image: postgres
    environment:
      POSTGRES_PASSWORD: sandeep
      POSTGRES_USER: myuser
      POSTGRES_DB: mydb
  myadminer:
    image: adminer
    ports:
      - 8888:8080
    links:
      - mydb:postgres
...
```
### jenkins and tomecat server
```
---
version: '3.8'
services:
  myjenkins:
    image: jenkins/jenkins
    ports:
      - 5050:8080
  qaserver:
    image: tomee
    ports:
      - 6060:8080
    links:
      - myjenkins:jenkins
  prodserver:
    image: tomee
    ports:
      - 7070:8080
    links:
      - myjenkins:jenkins
...
```
### LAMP Container Architecture
```
---
version: '3.8'
services:
  mydb:
    image: mysql
    environment:
      MYSQL_ROOT_PASSWORD: sandeep
  apache:
    image: httpd
    ports:
      - 9999:80
    links:
      - mydb:mysql
  php:
    image: php:7.2-apache
    links:
      - mydb:mysql
      - apache:httpd
...
```
### Change docker-compose file name other one
```
Docker Compose file name is change the abc.yml
# cp docker-compose.yml abc.yml
# docker compose -f abc.yml up -d
# docker compose down
```

