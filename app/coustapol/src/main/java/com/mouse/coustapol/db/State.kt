package com.mouse.coustapol.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.android.gms.maps.model.LatLng
import org.json.JSONArray

@Entity(primaryKeys = ["Country", "Name"])
data class State(
    @ColumnInfo(name = "Country") val country: String,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Abbreviate") val abbreviate: String,
    @ColumnInfo(name = "Points") val pointsJson: String,
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
