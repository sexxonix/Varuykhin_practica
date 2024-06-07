FROM maven
COPY . /app
WORKDIR /app/build
RUN mvn clean package
CMD ["java", "-jar", "/app/startApp/target/startApp-1.0-SNAPSHOT.jar"]