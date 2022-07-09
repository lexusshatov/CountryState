package com.mouse.country_state.db

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["Name", "Country"])
data class State(
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Country") val country: String,
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "IsLicensed") val isLicensed: Boolean,
)
