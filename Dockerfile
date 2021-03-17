FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} /opt/app/issue-tracker.jar
CMD ["java", "-jar", "/opt/app/issue-tracker.jar"]
