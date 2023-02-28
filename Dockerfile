FROM openjdk:8-jdk-alpine

ENV SVC_NAME=treetest
RUN mkdir -p /opt/$SVC_NAME/
WORKDIR /opt/$SVC_NAME/

COPY target/$SVC_NAME*.jar /opt/$SVC_NAME/$SVC_NAME.jar

CMD exec java -Dspring.profiles.active=dev -jar /opt/$SVC_NAME/$SVC_NAME.jar