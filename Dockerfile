FROM 100.125.0.198:20202/peter-demo/peter-maven:latest

RUN mkdir -p /home/spring-boot-demo
WORKDIR /home/spring-boot-demo

ADD . ./

RUN mvn clean package

CMD ["java","-jar","/home/spring-boot-demo/target/springboot-helloworld-0.0.1-SNAPSHOT.jar"]
