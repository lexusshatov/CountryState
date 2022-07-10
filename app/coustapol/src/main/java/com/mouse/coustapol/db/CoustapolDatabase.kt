package com.mouse.coustapol.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Country::class, State::class], version = 20, exportSchema = false)
abstract class CoustapolDatabase: RoomDatabase() {
    abstract fun coustapolDao(): CoustapolDao
}