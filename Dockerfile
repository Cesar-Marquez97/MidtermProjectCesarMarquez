FROM eclipse-temurin:25
WORKDIR /midtermProject
COPY target/singlefile-project-1.0-SNAPSHOT.jar midtermProject.jar
CMD ["java", "-jar", "midtermProject.jar"]