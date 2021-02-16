package com.ricardococati.ostraderbff.entities.domains.requests.recomendacao

import java.time.LocalDate

data class RecomendacaoSemanalRequest(
    val idRecomendacaoSemanal: Long?,
    val dtpregini: LocalDate,
    val dtpregfim: LocalDate,
    val recomendacao: Recomendacao?
)