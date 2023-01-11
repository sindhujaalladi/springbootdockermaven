FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/springbootdockermaven.jar springbootdockermaven.jar

ENTRYPOINT ["java","-jar","springbootdockermaven.jar"]