package com.ricardococati.ostraderbff.entities.domains.requests.recomendacao

import java.time.LocalDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "recomendacaoDiario")
data class RecomendacaoDiario (
    @Id
    val idRecomendacaoDiario: String?,
    val dtpreg: LocalDate?,
    val recomendacao: Recomendacao?
)