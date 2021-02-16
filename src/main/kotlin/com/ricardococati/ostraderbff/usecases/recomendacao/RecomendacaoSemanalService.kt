package com.ricardococati.ostraderbff.usecases.recomendacao

import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoSemanal

interface RecomendacaoSemanalService {

    fun incluirRecomendacaoSemanal(message: RecomendacaoSemanal?)

}
