package com.ricardococati.ostraderbff.adapters.message

import com.ricardococati.ostraderbff.entities.constants.Topics.Companion.RECOMENDACAO_SEMANAL
import com.ricardococati.ostraderbff.usecases.recomendacao.message.MessageExecutorRecomendacaoDiario
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageListenerRecomendacaoSemanal(
    private val executorRecomendacaoDiario: MessageExecutorRecomendacaoDiario
) {

    @KafkaListener(topics = [RECOMENDACAO_SEMANAL])
    fun consume(consumerRecord: ConsumerRecord<*, *>) {
        executorRecomendacaoDiario.execute(consumerRecord.value().toString())
    }

}