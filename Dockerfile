FROM openjdk:13-jdk-alpine

ENV APPLICATION_USER timesup_back_usr
RUN adduser -D -g '' $APPLICATION_USER

RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY ./build/libs/perso_times_up-0.0.1-SNAPSHOT.jar /app/timesup_back.jar
WORKDIR /app

CMD ["java", "-server", "-Xmx256m", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "timesup_back.jar"]

