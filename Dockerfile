FROM maven:3.8.5-openjdk-17 as build
COPY . .
RUN mnv clean package -DskipTests

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build target/myApi.jar app.jar
EXPOSE 8080
CMD java -jar app.jar


