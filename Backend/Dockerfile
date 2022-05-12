#FROM openjdk:11
#ADD  target/Backend-0.0.1-SNAPSHOT.jar Backend-0.0.1-SNAPSHOT.jar
#EXPOSE 8090
FROM openjdk:11
WORKDIR /app
COPY ./ ./
ENTRYPOINT ["java","-jar","target/Backend-0.0.1-SNAPSHOT.jar"]
