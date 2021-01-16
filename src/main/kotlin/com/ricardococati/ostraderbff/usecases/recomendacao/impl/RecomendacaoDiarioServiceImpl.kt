package com.ricardococati.ostraderbff.usecases.recomendacao.impl

import com.ricardococati.ostraderbff.entities.domains.recomendacao.RecomendacaoDiario
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoDiarioService
import org.springframework.stereotype.Service

@Service
class RecomendacaoDiarioServiceImpl : RecomendacaoDiarioService {

    override fun incluirRecomendacaoDiario(message: RecomendacaoDiario?): Boolean? {
        return false
    }

}