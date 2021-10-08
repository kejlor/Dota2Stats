package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class KillsPerMin(
    @SerializedName("pct")
    val pct: Double,
    @SerializedName("raw")
    val raw: Double
)