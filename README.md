# Kotlin + Spring Boot + Kafka + Docker

## Up Kafka + Zookeeper on Docker
`$ docker-compose -f docker-compose.yml up`

## Produce Message
`$ curl -X POST http://localhost:8080/api/message -d "Kafka works!" -H "Content-Type: text/plain"`
