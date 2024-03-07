FROM eclipse-temurin:17
COPY target/mydevapp.jar mydevapp.jar
CMD ["java","-jar","mydevapp.jar"]