FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 直接复制整个项目（包括queue-system-parent）
COPY queue-system-parent ./queue-system-parent

# 进入子模块目录执行打包
WORKDIR /app/queue-system-parent/queue-system-web
RUN mvn clean package -DskipTests

# 运行阶段
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/queue-system-parent/queue-system-web/target/*.jar app.jar

# 启动服务
ENTRYPOINT ["java", "-jar", "app.jar"]
