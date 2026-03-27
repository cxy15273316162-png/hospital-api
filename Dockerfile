# 基础 Java 运行环境
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制 Maven 构建好的 jar 包到容器里
# 注意：这里要和你 target 目录里的 jar 包名字完全一致！
COPY queue-system-parent/queue-system-web/target/queue-system-web-1.0-SNAPSHOT.jar app.jar

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]