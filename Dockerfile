# 直接用单阶段构建（适合小项目，更稳定）
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/*.jar"]