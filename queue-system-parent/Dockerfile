FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 复制整个多模块项目
COPY . .

# 进入主模块（queue-system-web）执行打包
WORKDIR /app/queue-system-web
RUN mvn clean package -DskipTests

# 运行阶段，只保留 JRE 和打包好的 JAR
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/queue-system-web/target/*.jar app.jar

# 启动服务
ENTRYPOINT ["java", "-jar", "app.jar"]
