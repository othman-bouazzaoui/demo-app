FROM openjdk:11
VOLUME /tmp
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://10.10.1.3:5432/demodb
ENV SPRING_DATASOURCE_USERNAME=othman
ENV SPRING_DATASOURCE_PASSWORD=othman
ADD target/demoApp-0.0.1-SNAPSHOT.jar /demoApp.jar
CMD ["java", "-jar","demoApp.jar"]
EXPOSE 8081