package com.mouse.coustapol.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Country(
    @PrimaryKey
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "PhoneCode") val phoneCode: Int,
    @ColumnInfo(name = "PhoneMask") val phoneMask: String,
)
