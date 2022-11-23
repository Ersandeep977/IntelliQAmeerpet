
## docker-compose file Example
### Command
```
# vim docker-compose.yml
# docker compose up -d
# docker compose stop
# docker compose down
```
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
