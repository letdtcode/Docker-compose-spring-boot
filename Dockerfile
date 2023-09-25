# syntax=docker/dockerfile:1

#Which "official Java image" ?
FROM openjdk:22-jdk-oracle
#working directory
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#Run this inside the image
RUN ./mvnw dependency:go-offline
COPY src ./src
#run inside container
CMD ["./mvnw","spring-boot:run"]