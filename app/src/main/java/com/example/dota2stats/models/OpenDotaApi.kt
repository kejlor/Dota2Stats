package com.example.dota2stats.models

import com.example.dota2stats.data.GameHistory
import com.example.dota2stats.data.GameHistoryItem
import com.example.dota2stats.data.Profile
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenDotaApi {
    @GET("/players/steam_id")
    suspend fun getDataFromSearchedProfile(
        @Query("steam_id") id: Int
    ): Profile
    @GET("/players/steam_id/matches")
    suspend fun getRecentGamesOfSearchedUser(
        @Query("steam_id") id: Int
    ): GameHistoryItem
    @GET("/players/matches/match_id")
    suspend fun getMatchDetailsForSelectedGame(
        @Query("match_id") id: Int
    ): GameHistoryItem
}