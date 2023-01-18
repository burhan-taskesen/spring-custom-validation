FROM openjdk:17-slim
WORKDIR /app
ADD build/libs/spring-custom-validation-0.0.1-SNAPSHOT.jar custom-validation-without-throw.jar
ENTRYPOINT ["java", "-jar", "custom-validation-without-throw.jar"]