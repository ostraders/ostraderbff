package com.ricardococati.ostraderbff.entities.domains.requests.recomendacao

import java.time.LocalDate

data class RecomendacaoDiarioRequest (
    val idRecomendacaoDiario: Long?,
    val dtpreg: LocalDate?,
    val recomendacao: Recomendacao?
)