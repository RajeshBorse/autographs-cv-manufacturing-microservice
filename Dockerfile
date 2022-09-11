FROM --platform=linux/amd64 openjdk:15
COPY  target/autographs-cv-manufacturing-microservice.jar autographs-cv-manufacturing-microservice.jar
ENTRYPOINT [ "java", "-jar",  "autographs-cv-manufacturing-microservice.jar"]
EXPOSE 8004