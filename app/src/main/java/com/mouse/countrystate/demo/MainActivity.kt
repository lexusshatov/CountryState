package com.mouse.countrystate.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mouse.country_state.CountryState
import com.mouse.countrystate.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.find.setOnClickListener {
            val query = binding.edit.text?.toString().orEmpty()
            lifecycleScope.launch(Dispatchers.IO) {
                val findResult = CountryState.getAllCountries()
                withContext(Dispatchers.Main) {
                    binding.info.text = findResult.toString()
                }
            }
        }
    }
}