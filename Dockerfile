FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} /opt/app/issue-tracker.jar
CMD ["java", "-jar", "/opt/app/issue-tracker.jar"]
