FROM maven:3.9.2-ibm-semeru-17-focal

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/firstClass-0.0.1-SNAPSHOT.jar"]