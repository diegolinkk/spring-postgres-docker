FROM azul/zulu-openjdk:21-jre
VOLUME /tmp
COPY /target/postgresteste-0.0.1-SNAPSHOT.jar postgresteste-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/postgresteste-0.0.1-SNAPSHOT.jar"]   