FROM adoptopenjdk/openjdk11
ARG JAR_FILE_PATH=target/*.jar
COPY ${JAR_FILE_PATH} gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]
EXPOSE 8080