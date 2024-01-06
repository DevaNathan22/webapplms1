FROM eclipse-temurin:17
COPY target/webapplms1.jar webapplms1.jar
CMD [ "java","-jar","webapplms1.jar" ]