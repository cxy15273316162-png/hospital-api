# 第一阶段：用 Maven 构建项目
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app
# 先复制 pom.xml 单独下载依赖，利用缓存
COPY pom.xml .
RUN mvn dependency:go-offline -B
# 再复制源码并打包
COPY src ./src
RUN mvn clean package -DskipTests

# 第二阶段：用最小的 JRE 运行
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# 从构建阶段复制 JAR 包
COPY --from=builder /app/target/*.jar app.jar
# 暴露端口（Railway 会自动映射）
EXPOSE 8080
# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]