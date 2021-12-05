FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.13_8
VOLUME /tmp

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]