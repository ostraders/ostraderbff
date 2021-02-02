package com.ricardococati.ostraderbff.entities.domains.recomendacao

import java.time.LocalDate

data class RecomendacaoSemanal(
    var idRecomendacaoSemanal: Long?,
    var dtpregini: LocalDate,
    var dtpregfim: LocalDate,
    var recomendacao: Recomendacao?
)