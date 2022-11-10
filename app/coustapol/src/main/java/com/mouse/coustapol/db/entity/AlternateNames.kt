package com.mouse.coustapol.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["StateID", "Name"])
data class AlternateNames(
    @ColumnInfo(name = "StateID") val stateId: Int,
    @ColumnInfo(name = "Name") val name: String,
)
