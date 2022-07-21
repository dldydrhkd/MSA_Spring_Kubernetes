FROM adoptopenjdk/openjdk11
ARG JAR_FILE_PATH=target/*.jar
COPY ${JAR_FILE_PATH} client.jar
ENTRYPOINT ["java", "-jar", "client.jar"]
EXPOSE 8080