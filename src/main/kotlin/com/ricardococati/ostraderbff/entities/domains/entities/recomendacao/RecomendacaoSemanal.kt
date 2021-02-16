package com.ricardococati.ostraderbff.entities.domains.requests.recomendacao

import java.time.LocalDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "recomendacaoSemanal")
data class RecomendacaoSemanal(
    @Id
    val idRecomendacaoSemanal: String?,
    val dtpregini: LocalDate,
    val dtpregfim: LocalDate,
    val recomendacao: Recomendacao

)