package com.mouse.country_state.db

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["Abbreviate", "Name"])
data class Country(
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "PhoneCode") val phoneCode: Int,
)
