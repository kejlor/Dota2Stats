package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class ProfileX(
    @SerializedName("account_id")
    val accountId: Int,
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("avatarfull")
    val avatarfull: String,
    @SerializedName("avatarmedium")
    val avatarmedium: String,
    @SerializedName("cheese")
    val cheese: Int,
    @SerializedName("is_contributor")
    val isContributor: Boolean,
    @SerializedName("last_login")
    val lastLogin: Any,
    @SerializedName("loccountrycode")
    val loccountrycode: String,
    @SerializedName("name")
    val name: Any,
    @SerializedName("personaname")
    val personaname: String,
    @SerializedName("plus")
    val plus: Boolean,
    @SerializedName("profileurl")
    val profileurl: String,
    @SerializedName("steamid")
    val steamid: String
)