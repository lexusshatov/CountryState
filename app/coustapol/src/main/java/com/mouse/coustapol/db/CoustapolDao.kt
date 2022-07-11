package com.mouse.coustapol.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CoustapolDao {

    @Query("SELECT * FROM Country WHERE Name=:query OR Abbreviate=:query")
    fun findCountry(query: String): Country?

    @Query("SELECT * FROM State WHERE State.Country=:country")
    fun findCountryStates(country: String): List<State>

    @Query("SELECT * FROM State WHERE Name=:query OR Abbreviate=:query")
    fun findState(query: String): State?
}