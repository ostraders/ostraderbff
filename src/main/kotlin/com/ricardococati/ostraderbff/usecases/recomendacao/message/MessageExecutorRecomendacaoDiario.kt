package com.ricardococati.ostraderbff.usecases.recomendacao.message

interface MessageExecutorRecomendacaoDiario {
    fun execute(payload: String)
}