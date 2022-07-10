package com.mouse.countrystate.demo

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mouse.country_state.CountryState
import com.mouse.country_state.db.points
import com.mouse.countrystate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findCountry.setOnClickListener {
            val query = binding.editCountry.string
            val country = CountryState.findCountry(query) ?: return@setOnClickListener
            binding.info.text = country.toString()
        }
        binding.findState.setOnClickListener {
            val query = binding.editState.string
            val state = CountryState.findState(query) ?: return@setOnClickListener
            binding.info.text = state.toString()
            println(state.points)
        }
    }
}

val EditText.string: String
    get() = text?.toString().orEmpty()