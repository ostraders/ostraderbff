package com.ricardococati.ostraderbff.usecases.recomendacao.message.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.ricardococati.ostraderbff.adapters.repositories.recomendacao.RecomendacaoDiarioRepository
import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoDiario
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoDiarioService
import com.ricardococati.ostraderbff.usecases.recomendacao.message.MessageExecutorRecomendacaoDiario
import java.io.IOException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class MessageExecutorRecomendacaoDiarioImpl(
    private val objectMapper: ObjectMapper,
    private val recomendacaoService: RecomendacaoDiarioService
) : MessageExecutorRecomendacaoDiario {

    override fun execute(payload: String) {
        val domain: RecomendacaoDiario = payloadToDomain(payload)
        log.info("payload: $payload")
        recomendacaoService.incluirRecomendacaoDiario(domain)
    }

    private fun payloadToDomain(payload: String): RecomendacaoDiario {
        return try {
            objectMapper.readValue(payload, RecomendacaoDiario::class.java)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(MessageExecutorRecomendacaoDiarioImpl::class.java)
    }

}