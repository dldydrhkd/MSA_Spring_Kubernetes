FROM adoptopenjdk/openjdk11
ARG JAR_FILE_PATH=target/*.jar
COPY ${JAR_FILE_PATH} server.jar
ENTRYPOINT ["java", "-jar", "server.jar"]
EXPOSE 8080