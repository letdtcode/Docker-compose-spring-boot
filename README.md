# Spring-boot-container-example
A small example of build docker compose for spring boot application service connect to mysql service
## Clone project
## Clean up services with the same name
```
docker rm -f mysql-springboot-container springboot-docker-container
```
### Download all dependencies and start service ! 
```
docker-compose -f docker-compose.dev.yml up --build
```
### Good luck ! 