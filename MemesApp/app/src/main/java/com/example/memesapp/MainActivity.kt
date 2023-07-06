package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var tvStepOne:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvStepOne=findViewById(R.id.btnStepone)
        tvStepOne.setOnClickListener {
            val intent=Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}