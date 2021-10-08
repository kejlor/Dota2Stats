package com.example.dota2stats.data


import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("competitive_rank")
    val competitiveRank: Any,
    @SerializedName("leaderboard_rank")
    val leaderboardRank: Any,
    @SerializedName("mmr_estimate")
    val mmrEstimate: MmrEstimate,
    @SerializedName("profile")
    val profile: ProfileX,
    @SerializedName("rank_tier")
    val rankTier: Int,
    @SerializedName("solo_competitive_rank")
    val soloCompetitiveRank: Any,
    @SerializedName("tracked_until")
    val trackedUntil: Any
)