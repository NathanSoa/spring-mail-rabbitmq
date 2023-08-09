FROM maven:3.9.3-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN  mvn clean install -DskipTests

ENTRYPOINT ["mvn", "spring-boot:run"]