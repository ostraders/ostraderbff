package com.ricardococati.ostraderbff.usecases.recomendacao.impl

import com.ricardococati.ostraderbff.adapters.repositories.recomendacao.RecomendacaoSemanalRepository
import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoSemanal
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoSemanalService
import org.springframework.stereotype.Service

@Service
class RecomendacaoSemanalServiceImpl(
    private val repository: RecomendacaoSemanalRepository
) : RecomendacaoSemanalService {

    override fun incluirRecomendacaoSemanal(recomendacaoSemanal: RecomendacaoSemanal?){
        repository.save(recomendacaoSemanal!!)
    }

}