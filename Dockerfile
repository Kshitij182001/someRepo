# Use the OpenJDK 17 Alpine image
FROM openjdk:17-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java code
RUN javac ThreeNum.java

# Run the program when the container starts
CMD ["java", "ThreeNum"]
