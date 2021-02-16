package com.ricardococati.ostraderbff.adapters.repositories.recomendacao

import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoSemanal
import org.springframework.data.mongodb.repository.MongoRepository

interface RecomendacaoSemanalRepository : MongoRepository<RecomendacaoSemanal, String>