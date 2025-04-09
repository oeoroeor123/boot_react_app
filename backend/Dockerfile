FROM openjdk:17

# ARG 값은 도커 이미지 빌드 타임에만 사용된다.
# From docker-compose.yml
ARG SPRING_API_KEY

# ENV 값은 도커 이미지를 도커 컨테이너로 실행할 때(런 타임) 사용된다.
# ARG to ENV
# $SPRING_API_KEY 값은 바로 위에 있는 ARG(인자) 값
# ENV 값이 Spring boot Project의 application.properties 파일로 넘어가는 값
ENV SPRING_API_KEY=$SPRING_API_KEY

WORKDIR /app
COPY . .
RUN chmod u+x mvnw
RUN ./mvnw clean package
RUN mv target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]