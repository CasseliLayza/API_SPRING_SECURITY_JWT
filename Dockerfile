#FROM openjdk:17
#ARG JAR_FILE=target/backUsuarios-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app_backend.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app_backend.jar"]FROM openjdk:17

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/backUsuarios-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_backend.jar
EXPOSE 8080
CMD ["java", "-jar", "app_backend.jar"]