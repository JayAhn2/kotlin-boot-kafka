package com.example.kafka.tut

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component


@Component
class KotlinProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    private val logger = LoggerFactory.getLogger(javaClass)

    fun send(message: String) {
        logger.info("[Producer] emit message: {}", message)
        kafkaTemplate.send("simple-message-topic", message)
    }

}


