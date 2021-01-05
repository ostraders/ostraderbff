package com.ricardococati.ostraderbff.config

import com.ricardococati.ostraderbff.adapters.queues.BasicListener
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConsumerConfig(
    private val connectionFactory: ConnectionFactory,
    private val basicListener: BasicListener,
    private val simpleRabbitListenerContainerFactory: SimpleRabbitListenerContainerFactory
) {
    @Bean
    fun listenerContainer(): SimpleMessageListenerContainer {
        val container = SimpleMessageListenerContainer()
        container.connectionFactory = connectionFactory
        val queueName: String = "recomendacao.diario.calcula.input"
        container.setQueueNames(queueName)
        container.setMessageListener(basicListener)
        simpleRabbitListenerContainerFactory.adviceChain?.let {
            container.setAdviceChain(*it)
        }
        return container
    }
}
