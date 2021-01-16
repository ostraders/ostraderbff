package com.ricardococati.ostraderbff.usecases.recomendacao

import com.ricardococati.ostraderbff.entities.domains.recomendacao.RecomendacaoDiario

interface RecomendacaoDiarioService {

    fun incluirRecomendacaoDiario(message: RecomendacaoDiario?): Boolean?

}
