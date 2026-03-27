# 基础 Java 运行环境（只需要 JRE，不需要 Maven）
FROM eclipse-temurin:17-jre

# 设置工作目录
WORKDIR /app

# 复制你本地已经打好的 JAR 包到容器
# 注意：路径要和你项目结构一致，是 queue-system-web/target/ 下的 jar
COPY queue-system-web/target/*.jar app.jar

# 暴露端口（和你项目端口 8089 一致）
EXPOSE 8089

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]