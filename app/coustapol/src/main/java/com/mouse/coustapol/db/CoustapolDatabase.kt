package com.mouse.coustapol.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mouse.coustapol.db.entity.AlternateNames
import com.mouse.coustapol.db.entity.Country
import com.mouse.coustapol.db.entity.State

@Database(
    entities = [Country::class, State::class, AlternateNames::class],
    version = 1,
    exportSchema = false,
)
abstract class CoustapolDatabase : RoomDatabase() {
    abstract fun coustapolDao(): CoustapolDao
}