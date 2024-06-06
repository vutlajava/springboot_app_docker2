FROM openjdk-8-jdk
MAINTAINER Ashok<vutlajava@gmail.com>
COPY target/springboot_app_docker2-0.0.1-SNAPSHOT.jar  microservice2.jar
ENTRYPOINT ["java","-jar","/microservice2.jar"]
