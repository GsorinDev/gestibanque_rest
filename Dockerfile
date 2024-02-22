FROM maven:3.9.6-sapmachine-17

WORKDIR /app

COPY . /app

RUN mvn --version

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "/app/target/gestibanque_rest-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081