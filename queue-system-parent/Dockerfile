FROM eclipse-temurin:17-jre
WORKDIR /app
COPY queue-system-web/target/*.jar app.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "app.jar"]