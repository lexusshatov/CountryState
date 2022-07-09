package com.mouse.country_state.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CountryStateDao {

    @Query("SELECT * FROM Country")
    suspend fun getAllCountries(): List<Country>
}