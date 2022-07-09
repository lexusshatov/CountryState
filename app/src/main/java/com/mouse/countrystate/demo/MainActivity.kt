package com.mouse.countrystate.demo

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mouse.country_state.CountryState
import com.mouse.countrystate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findCountry.setOnClickListener {
            val query = binding.editCountry.string
            val findResult = CountryState.findCountry(query)
            binding.info.text = findResult.toString()
        }
        binding.findState.setOnClickListener {
            val query = binding.editState.string
            val findResult = CountryState.findState(query)
            binding.info.text = findResult.toString()
        }
    }
}

val EditText.string: String
    get() = text?.toString().orEmpty()