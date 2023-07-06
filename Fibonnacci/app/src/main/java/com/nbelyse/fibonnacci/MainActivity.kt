package com.nbelyse.fibonnacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbelyse.fibonnacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding = ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding
        setContentView(R.layout.activity_main)
    }
}