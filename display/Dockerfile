FROM adoptopenjdk/openjdk11
ARG JAR_FILE_PATH=target/*.jar
COPY ${JAR_FILE_PATH} display.jar
ENTRYPOINT ["java", "-jar", "display.jar"]
EXPOSE 8080