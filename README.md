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
docker-compose -f docker-compose.dev.yml up -d --build
```
> Option "-d" leaves the service execution running in the background
### 4. API for test
#### 4.1. End-point: Insert Student
#### *Method: POST*
```
http://localhost:8085/students/insertStudent
```
#### *Query Params*

|Param| value|
|---|------|
|name| Duc Thanh |
|birthYear| 2002 |
#### 4.1. End-point: Insert Student
#### *Method: GET*
```
http://localhost:8085/students/showAll
```
### Thank you ! 😀 
