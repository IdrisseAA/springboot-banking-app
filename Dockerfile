FROM eclipse-temurin:23-jdk-alpine
WORKDIR /banking-app
COPY target/springboot-banking-app-0.0.1-SNAPSHOT.jar banking-app.jar
EXPOSE 8080
CMD ["java", "-jar", "banking-app.jar"]