package com.example.cryptocurrencyapp.iu.coinlist

import com.example.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val error: String = "",
    val coins: List<Coin> = emptyList()
)
