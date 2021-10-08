package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class PermanentBuff(
    @SerializedName("permanent_buff")
    val permanentBuff: Int,
    @SerializedName("stack_count")
    val stackCount: Int
)