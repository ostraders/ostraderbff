package com.ricardococati.ostraderbff.adapters.message

import com.ricardococati.ostraderbff.entities.constants.Topics.Companion.RECOMENDACAO_DIARIA
import com.ricardococati.ostraderbff.usecases.recomendacao.message.MessageExecutorRecomendacaoDiario
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageListenerCandleDiario(
    private val executorRecomendacaoDiario: MessageExecutorRecomendacaoDiario
) {

    @KafkaListener(topics = [RECOMENDACAO_DIARIA])
    fun consume(consumerRecord: ConsumerRecord<*, *>) {
        executorRecomendacaoDiario.execute(consumerRecord.value().toString())
    }

}