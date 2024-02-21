FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/crud_operation.jar /app/crud_operation.jar

EXPOSE 8080

CMD ["java", "-jar", "crud_operation.jar"]
