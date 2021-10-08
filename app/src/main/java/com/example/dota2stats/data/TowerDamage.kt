package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class TowerDamage(
    @SerializedName("pct")
    val pct: Double,
    @SerializedName("raw")
    val raw: Int
)