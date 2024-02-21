# Use a base image with Maven and Java installed
FROM maven:3.8.4-openjdk-11-slim AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project file
COPY pom.xml .

# Copy the Maven wrapper
COPY mvnw .

# Copy the Maven wrapper settings
COPY .mvn .mvn

# Download Maven dependencies (this layer will be cached if the pom.xml hasn't changed)
RUN ./mvnw dependency:go-offline

# Copy the application source code
COPY src src

# Build the application
RUN ./mvnw package

# Use a lightweight base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar /app/

# Expose the port your application runs on
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "$(ls /app/*.jar | grep -v original)"]
