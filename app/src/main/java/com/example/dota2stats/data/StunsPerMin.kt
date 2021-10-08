package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class StunsPerMin(
    @SerializedName("pct")
    val pct: Int,
    @SerializedName("raw")
    val raw: Int
)