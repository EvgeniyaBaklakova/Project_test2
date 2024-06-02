FROM ubuntu:latest
LABEL authors="Geny"

RUN apk add openjdk17

COPY target/demo*.jar /app.jar


ENTRYPOINT ["java", "-jar", "/app.jar"]