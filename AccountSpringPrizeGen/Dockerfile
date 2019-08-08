FROM maven:latest as base
WORKDIR /build
COPY . .
RUN mvn clean package
FROM java:8
WORKDIR /opt/app
COPY --from=base /build/target/PrizeGenerator2-0.0.1-SNAPSHOT.jar server.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "server.jar"]
