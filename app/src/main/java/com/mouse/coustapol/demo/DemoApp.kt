package com.mouse.coustapol.demo

import android.app.Application
import com.mouse.coustapol.Coustapol

class DemoApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Coustapol.init(applicationContext)
    }
}