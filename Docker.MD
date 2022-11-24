# Docker Notes
### Docker web link
https://get.docker.com/
### install 
```
#! /bin/bash
curl -fsSL https://test.docker.com -o test-docker.sh
sh test-docker.sh
```
### delete all thing
```
docker rm -f $(docker ps -aq)
docker system prune -af
```
