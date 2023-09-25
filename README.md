# Spring-boot-container-example
A small example of build docker compose for spring boot application service connect to mysql service
## Step out
### 1. Clone project 
### 2. Clean up services with the same name
```
docker rm -f mysql-springboot-container springboot-docker-container
```
### 3. Download all dependencies and start service ! 
```
docker-compose -f docker-compose.dev.yml up --build
```
### 4. API for test
```
http://localhost:8085/students/insertStudent
```
> Method: POST
> param 1: "name":String
> param 2: "birthYear":Integer
```
http://localhost:8085/students/showAll
```
> Method: GET
### Good luck ! 