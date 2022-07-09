package com.mouse.country_state.db

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["Country", "Name"])
data class State(
    @ColumnInfo(name = "Country") val country: String,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "IsLicensed", defaultValue = "1") val isLicensed: Int,
)
