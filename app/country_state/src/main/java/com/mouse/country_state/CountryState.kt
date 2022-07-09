package com.mouse.country_state

import android.content.Context
import androidx.room.Room
import com.mouse.country_state.db.Country
import com.mouse.country_state.db.CountryStateDao
import com.mouse.country_state.db.CountryStateDatabase

object CountryState : CountryStateDao {

    private const val DATABASE_NAME = "CountryStates.db"
    private lateinit var database: CountryStateDatabase
    private val dao: CountryStateDao
        get() = database.countryStateDao()

    fun init(appContext: Context) {
        appContext.deleteDatabase(DATABASE_NAME)
        database = Room.databaseBuilder(
            appContext,
            CountryStateDatabase::class.java,
            DATABASE_NAME
        )
            .createFromAsset(DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }

    override fun findCountry(query: String): Country? {
        return dao.findCountry(query)
    }
}