FROM openjdk:8-slim
MAINTAINER Tide <martin.bechtle@infinityworks.com>

WORKDIR /app
RUN pwd
RUN ls -la /

ADD bin/run-jar.sh /app
ADD build/libs/*.jar /app

EXPOSE 8080
CMD ["/app/run-jar.sh"]