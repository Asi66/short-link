# 使用官方的 OpenJDK 基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将构建好的 JAR 文件复制到容器中
COPY target/short-link-0.0.1.jar /app/short-link.jar

# 暴露应用程序的端口
EXPOSE 8081

# 运行 Spring Boot 应用程序
ENTRYPOINT ["java", "-jar", "short-link.jar"]