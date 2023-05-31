


FROM openjdk:8
COPY /target/spring-boot-app.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java" , "-jar" ,"spring-boot-app.jar"]
