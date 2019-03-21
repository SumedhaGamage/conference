FROM openjdk:8-jdk-alpine
COPY target/api-1.0.0 /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]