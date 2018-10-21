FROM brunokarpo/openjdk-8
LABEL maintainer="Bruno Nogueira <ti.brunonogueira at gmail.com>"
RUN mkdir -p /app/
ADD build/libs/*.jar /app/sentence-client.jar

ENTRYPOINT ["java", "-jar", "/app/sentence-client.jar"]