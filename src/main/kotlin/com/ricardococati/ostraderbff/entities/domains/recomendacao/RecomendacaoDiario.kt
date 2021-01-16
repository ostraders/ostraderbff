package com.ricardococati.ostraderbff.entities.domains.recomendacao

import java.time.LocalDate

data class RecomendacaoDiario (
    var idRecomendacaoDiario: Long?,
    var dtpreg: LocalDate?,
    var recomendacao: Recomendacao?
)