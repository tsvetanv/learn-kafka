FROM openjdk:13

ARG BUILD_VERSION
ARG BUILD_DATE
LABEL build-version=$BUILD_VERSION
LABEL build-date=$BUILD_DATE
LABEL name="eureka-discovery-server"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]