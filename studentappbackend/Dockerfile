FROM eclipse-temurin:17-alpine AS build-stage

WORKDIR /app

COPY . .

RUN ./mvnw clean package

FROM eclipse-temurin:17-alpine

COPY target/Studentappbackend-0.0.1-SNAPSHOT.jar .
COPY ./run.sh  .
RUN chmod +u run.sh

EXPOSE 8081

CMD [ "sh","run.sh" ]