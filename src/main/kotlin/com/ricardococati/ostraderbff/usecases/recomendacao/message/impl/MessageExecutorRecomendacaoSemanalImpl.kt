package com.ricardococati.ostraderbff.usecases.recomendacao.message.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.ricardococati.ostraderbff.entities.domains.recomendacao.RecomendacaoSemanal
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoSemanalService
import com.ricardococati.ostraderbff.usecases.recomendacao.message.MessageExecutorRecomendacaoSemanal
import java.io.IOException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class MessageExecutorRecomendacaoSemanalImpl(
    private val objectMapper: ObjectMapper,
    private val recomendacaoService: RecomendacaoSemanalService
) : MessageExecutorRecomendacaoSemanal {

    override fun execute(payload: String) {
        val domain: RecomendacaoSemanal = payloadToDomain(payload)
        log.info("payload: $payload")
        recomendacaoService.incluirRecomendacaoSemanal(domain)
    }

    private fun payloadToDomain(payload: String): RecomendacaoSemanal {
        return try {
            objectMapper.readValue(payload, RecomendacaoSemanal::class.java)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(MessageExecutorRecomendacaoSemanalImpl::class.java)
    }

}