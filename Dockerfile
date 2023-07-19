FROM openjdk:17-alpine
EXPOSE 8080
#ENV JDBC_URL=jdbc:postgresql://172.17.0.2:5432/testdatabase
WORKDIR /app
COPY target/myApi.jar app.jar
CMD java -jar app.jar


