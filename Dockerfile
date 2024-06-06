FROM openjdk:20
VOLUME /temp
EXPOSE 2505
ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar

ENTRYPOINT ["java","-jar","/demo.jar"]