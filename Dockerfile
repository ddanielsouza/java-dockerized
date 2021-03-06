FROM openjdk:16-jdk-alpine3.13

RUN apk update &&  apk add inotify-tools 

WORKDIR /app

EXPOSE 8080

CMD ./startup.sh