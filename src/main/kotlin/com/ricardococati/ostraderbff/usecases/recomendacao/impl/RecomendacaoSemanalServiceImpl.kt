package com.ricardococati.ostraderbff.usecases.recomendacao.impl

import com.ricardococati.ostraderbff.entities.domains.recomendacao.RecomendacaoSemanal
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoSemanalService
import org.springframework.stereotype.Service

@Service
class RecomendacaoSemanalServiceImpl : RecomendacaoSemanalService {

    override fun incluirRecomendacaoSemanal(message: RecomendacaoSemanal?): Boolean? {
        return false
    }

}