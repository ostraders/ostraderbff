package com.ricardococati.ostraderbff.entities.domains.recomendacao

import java.math.BigDecimal

data class Recomendacao (
    var codneg: String?,
    var precoAbertura: BigDecimal?,
    var precoFechamento: BigDecimal?,
    var precoMinimo: BigDecimal?,
    var precoMaximo: BigDecimal?,
    var precoMME12p: BigDecimal?,
    var precoMME26p: BigDecimal?,
    var precoMacd: BigDecimal?,
    var precoSinalMacd: BigDecimal?,
    var precoHistograma: BigDecimal?,
    var decisao: String?
)