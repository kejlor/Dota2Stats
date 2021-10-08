package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class MmrEstimate(
    @SerializedName("estimate")
    val estimate: Int
)