package com.mouse.coustapol.demo

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mouse.coustapol.Coustapol
import com.mouse.coustapol.databinding.ActivityDemoBinding
import com.mouse.coustapol.db.points

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDemoBinding = ActivityDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findCountry.setOnClickListener {
            val query = binding.editCountry.string
            val country = Coustapol.findCountry(query) ?: return@setOnClickListener
            binding.info.text = country.toString()
        }
        binding.findState.setOnClickListener {
            val query = binding.editState.string
            val state = Coustapol.findState(query) ?: return@setOnClickListener
            binding.info.text = state.toString()
            println(state.points)
        }
    }
}

val EditText.string: String
    get() = text?.toString().orEmpty()