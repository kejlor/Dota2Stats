package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class GameHistoryItem(
    @SerializedName("assists")
    val assists: Int,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("duration")
    val duration: Int,
    @SerializedName("game_mode")
    val gameMode: Int,
    @SerializedName("hero_id")
    val heroId: Int,
    @SerializedName("kills")
    val kills: Int,
    @SerializedName("leaver_status")
    val leaverStatus: Int,
    @SerializedName("lobby_type")
    val lobbyType: Int,
    @SerializedName("match_id")
    val matchId: Int,
    @SerializedName("party_size")
    val partySize: Int,
    @SerializedName("player_slot")
    val playerSlot: Int,
    @SerializedName("radiant_win")
    val radiantWin: Boolean,
    @SerializedName("skill")
    val skill: Int,
    @SerializedName("start_time")
    val startTime: Int,
    @SerializedName("version")
    val version: Int
)