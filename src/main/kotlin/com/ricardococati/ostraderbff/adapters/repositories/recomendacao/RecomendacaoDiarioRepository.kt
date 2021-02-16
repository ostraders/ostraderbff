package com.ricardococati.ostraderbff.adapters.repositories.recomendacao

import com.ricardococati.ostraderbff.entities.domains.requests.recomendacao.RecomendacaoDiario
import org.springframework.data.mongodb.repository.MongoRepository

interface RecomendacaoDiarioRepository : MongoRepository<RecomendacaoDiario, String>