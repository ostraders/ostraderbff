package com.ricardococati.ostraderbff.entities.domains.requests.recomendacao

import java.math.BigDecimal

data class Recomendacao (
    val codneg: String?,
    val precoAbertura: BigDecimal?,
    val precoFechamento: BigDecimal?,
    val precoMinimo: BigDecimal?,
    val precoMaximo: BigDecimal?,
    val precoMME12p: BigDecimal?,
    val precoMME26p: BigDecimal?,
    val precoMacd: BigDecimal?,
    val precoSinalMacd: BigDecimal?,
    val precoHistograma: BigDecimal?,
    val decisao: String?
)