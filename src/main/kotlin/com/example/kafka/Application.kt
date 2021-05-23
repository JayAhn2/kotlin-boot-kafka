package com.example.kafka

import com.example.kafka.tut.CustomConfigs
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties(CustomConfigs::class)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
