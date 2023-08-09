
FROM openjdk:17

MAINTAINER <bhushan.shimpi@scania.com>

COPY target/sb-app-1.0.jar  usr/app/sb-app-1.0.jar

WORKDIR usr/app

ENTRYPOINT ["java","-jar","sb-app-1.0.jar"]
