FROM openjdk:17-oracle
ADD build/libs/*.jar application.jar
ENTRYPOINT ["java", "-jar","application.jar"]
EXPOSE 8080