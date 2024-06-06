FROM openjdk:11
COPY target/springboot_app_docker2.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java","-jar", "springboot_app_docker2.jar"]