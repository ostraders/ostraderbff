package com.ricardococati.ostraderbff.usecases.recomendacao.impl

import com.ricardococati.ostraderbff.adapters.repositories.recomendacao.RecomendacaoDiarioRepository
import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoDiario
import com.ricardococati.ostraderbff.usecases.recomendacao.RecomendacaoDiarioService
import org.springframework.stereotype.Service

@Service
class RecomendacaoDiarioServiceImpl(
    private val repository: RecomendacaoDiarioRepository
) : RecomendacaoDiarioService {

    override fun incluirRecomendacaoDiario(recomendacaoDiario: RecomendacaoDiario?) {
        repository.save(recomendacaoDiario!!)
    }

}