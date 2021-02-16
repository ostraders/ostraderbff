package com.ricardococati.ostraderbff.usecases.recomendacao

import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoDiario

interface RecomendacaoDiarioService {

    fun incluirRecomendacaoDiario(message: RecomendacaoDiario?)

}
