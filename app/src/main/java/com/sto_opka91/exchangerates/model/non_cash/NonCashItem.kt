package com.sto_opka91.exchangerates.model.non_cash

data class NonCashItem(
    val base_ccy: String,
    val buy: String,
    val ccy: String,
    val sale: String
)