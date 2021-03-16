FROM adoptopenjdk:11-jre-hotspot
WORKDIR /opt/app
COPY target/issue-tracker-0.0.1-SNAPSHOT.jar /opt/app/issue-tracker.jar
CMD ["java", "-jar", "/opt/app/issue-tracker.jar"]
