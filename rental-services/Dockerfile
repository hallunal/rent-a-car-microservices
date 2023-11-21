FROM openjdk:17-slim as build
COPY target/rental-services-0.0.1-SNAPSHOT.jar rental-services-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "rental-services-0.0.1-SNAPSHOT.jar"]