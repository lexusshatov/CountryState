package com.mouse.coustapol.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.gms.maps.model.LatLng
import com.mouse.coustapol.Coustapol
import org.json.JSONArray

@Entity
data class State(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID") val id: Int,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Country") val country: String,
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "Points", defaultValue = "[]") val pointsJson: String,
)

val State.points: List<LatLng>
    get() {
        val pointsArray = JSONArray(pointsJson)
        return (0 until pointsArray.length()).map {
            val latLngObject = pointsArray.getJSONObject(it)
            val latitude = latLngObject.getDouble("lat")
            val longitude = latLngObject.getDouble("lng")
            LatLng(latitude, longitude)
        }
    }

val State.alternateNames: List<String>
    get() = Coustapol.findStateAlternateNames(id)
