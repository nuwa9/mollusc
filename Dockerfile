#FROM eclipse-temurin:22-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#CMD ["./gradlew", "clean", "bootJar"]
#COPY build/libs/*.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]