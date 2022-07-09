package com.mouse.countrystate.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mouse.country_state.CountryState
import com.mouse.countrystate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.find.setOnClickListener {
            val query = binding.edit.text?.toString().orEmpty()
            val findResult = CountryState.findCountry(query)
            binding.info.text = findResult.toString()
        }
    }
}