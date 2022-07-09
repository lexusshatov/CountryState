package com.mouse.country_state.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Country::class, State::class], version = 1)
abstract class CountryStateDatabase: RoomDatabase() {
    abstract fun countryStateDao(): CountryStateDao
}