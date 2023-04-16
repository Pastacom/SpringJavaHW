FROM openjdk:19-jdk-alpine

WORKDIR /app

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} api-application.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "api-application.jar"]