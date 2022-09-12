FROM openjdk:15
ADD target/autographs-cv-manufacturing-microservice.jar autographs-cv-manufacturing-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-cv-manufacturing-microservice.jar"]
EXPOSE 8004