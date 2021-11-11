# spring-cloud-eureka-docker-demo
Demo project: How to build Eureka server and client containers, orchestrated via docker-compose

Utilizing Spring Cloud Eureka's Service Discovery, generate a random sentence; each word is sourced from a seperate microservice container

- Clone repo and cd into it
- run "docker-compose up --build -d"
- Eureka server dashboard: localhost:8761
  - if no instances discovered: wait 30 seconds, refresh page
- Get random sentence: GET localhost:8080/sentence
- To stop, run "docker-compose stop" in same directory
