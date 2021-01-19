package com.ricardococati.ostraderbff.config

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.producer.ProducerConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.config.KafkaListenerContainerFactory
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer

@Configuration
@EnableKafka
class KafkaConfig {

    @Bean
    fun kafkaListenerContainerFactory():
            KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<Int, String>> {
        val concurrency = 30
        val pollTimeOut = 3000L
        val factory = ConcurrentKafkaListenerContainerFactory<Int, String>()
        factory.consumerFactory = consumerFactory()
        factory.setConcurrency(concurrency)
        factory.containerProperties.pollTimeout = pollTimeOut
        return factory
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<Int, String> {
        return DefaultKafkaConsumerFactory(consumerConfigs())
    }

    @Bean
    fun consumerConfigs(): Map<String, Any?> {
        val props: MutableMap<String, Any?> = HashMap()
        props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092"
        props[ConsumerConfig.GROUP_ID_CONFIG] = "bmf"
        props[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] =
            "org.apache.kafka.common.serialization.StringDeserializer"
        props[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] =
            "org.apache.kafka.common.serialization.StringDeserializer"
        props[ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG] = false
        props[ConsumerConfig.MAX_POLL_RECORDS_CONFIG] = 10
        props[ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG] = 1000
        props[ProducerConfig.MAX_REQUEST_SIZE_CONFIG] = 15728640
        props[ConsumerConfig.AUTO_OFFSET_RESET_CONFIG] = "earliest"
        return props
    }
}