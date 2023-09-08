FROM openjdk:17-alpine3.14
WORKDIR /app
COPY ./target/demoproject-0.0.1-SNAPSHOT.jar ./spring-boot-demoapp.jar
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-demoapp.jar" ]