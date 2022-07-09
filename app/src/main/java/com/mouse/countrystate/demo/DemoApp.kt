package com.mouse.countrystate.demo

import android.app.Application
import com.mouse.country_state.CountryState

class DemoApp : Application() {

    override fun onCreate() {
        super.onCreate()
        CountryState.init(applicationContext)
    }
}