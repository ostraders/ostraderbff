package com.ricardococati.ostraderbff.usecases.recomendacao

import com.ricardococati.ostraderbff.entities.domains.recomendacao.RecomendacaoSemanal

interface RecomendacaoSemanalService {

    fun incluirRecomendacaoSemanal(message: RecomendacaoSemanal?): Boolean?

}
