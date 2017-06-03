FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY target/docker-jdk-1.0-SNAPSHOT-jar-with-dependencies.jar docker-jdk-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java", "-jar", "docker-jdk-1.0-SNAPSHOT-jar-with-dependencies.jar"]
