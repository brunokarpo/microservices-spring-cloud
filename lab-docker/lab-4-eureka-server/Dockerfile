FROM brunokarpo/openjdk-8
LABEL maintainer="Bruno Nogueira <ti.brunonogueira at gmail.com>"
EXPOSE 8001

RUN mkdir -p /app/

ADD build/libs/*.jar /app/eureka-server.jar

ENTRYPOINT ["java", "-jar", "/app/eureka-server.jar"]