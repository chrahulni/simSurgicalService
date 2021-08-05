FROM maven:3.6.3-adoptopenjdk-11 AS MAVEN_BUILD
 
# copy the pom and src code to the container
COPY ./ ./
 
# clean and package our application code
RUN mvn clean package
 
# the second stage of our build will use adoptopenjdk 11
FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine
MAINTAINER Rahul Chintala "rahul.chintala@mountsinai.org"
 
# copy only the artifacts we need from the first stage and discard the rest
WORKDIR /app
COPY --from=MAVEN_BUILD target/*.jar /app/simsurgicalservices.jar

# set the startup command to execute the jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/simsurgicalservices.jar"]