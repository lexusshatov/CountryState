package com.mouse.coustapol

import android.content.Context
import androidx.room.Room
import com.mouse.coustapol.db.Country
import com.mouse.coustapol.db.CoustapolDao
import com.mouse.coustapol.db.CoustapolDatabase
import com.mouse.coustapol.db.State

object Coustapol : CoustapolDao {

    private const val DATABASE_NAME = "CountryStates.db"
    private lateinit var database: CoustapolDatabase
    private val dao: CoustapolDao
        get() = database.coustapolDao()

    fun init(appContext: Context) {
        appContext.deleteDatabase(DATABASE_NAME)
        database = Room.databaseBuilder(
            appContext,
            CoustapolDatabase::class.java,
            DATABASE_NAME
        )
            .createFromAsset(DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }

    override fun findCountry(query: String): Country? {
        return dao.findCountry(query)
    }

    override fun findState(query: String): State? {
        return if (query.isNotEmpty()) dao.findState(query) else null
    }

    override fun findCountryStates(country: String): List<State> {
        val countryData: Country = findCountry(country) ?: return emptyList()
        return dao.findCountryStates(countryData.abbreviate)
    }
}