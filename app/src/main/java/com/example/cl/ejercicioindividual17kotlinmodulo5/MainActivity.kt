package com.example.cl.ejercicioindividual17kotlinmodulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cl.ejercicioindividual17kotlinmodulo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}