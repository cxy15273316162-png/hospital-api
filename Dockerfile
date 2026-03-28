FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 复制整个项目到构建容器
COPY . .

# 进入父工程目录执行打包
WORKDIR /app/queue-system-parent
RUN mvn clean package -DskipTests

# 运行阶段，只保留 JRE 和打包好的 JAR
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/queue-system-parent/queue-system-web/target/*.jar app.jar

# 启动应用
ENTRYPOINT ["java", "-jar", "app.jar"]
