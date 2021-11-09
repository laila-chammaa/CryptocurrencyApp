package com.example.cryptocurrencyapp.iu.coindetail

import com.example.cryptocurrencyapp.domain.model.Coin
import com.example.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val error: String = "",
    val coin: CoinDetail? = null
)
