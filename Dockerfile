FROM eclipse-temurin:21
COPY ./*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]