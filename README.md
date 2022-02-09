# sb-microservices

Based from https://github.com/PacktPublishing/Hands-On-Microservices-with-Spring-Boot-and-Spring-Cloud/tree/master/Chapter09 with changes:
1) upgrade to spring boot 2.6.3
2) upgrade to spring cloud 2021.0.0
3) added spring-boot-admin

Run:
./gradlew clean build && docker-compose build && docker-compose up -d

product-composite Swagger UI:
1. localhost:8080/product-composite/swagger-ui/index.html

spring boot admin:
1. localhost:8080/admin (hidden behind gateway)
2. localhost:8081 (exposed external port)
