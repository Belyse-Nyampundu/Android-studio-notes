package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var tvStepFour: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tvStepFour = findViewById(R.id.btnStepFour)
        tvStepFour.setOnClickListener {
            val intent = Intent(this, MemeFive::class.java)
            startActivity(intent)
        }
        lateinit var tvPrevv: Button
        tvPrevv = findViewById(R.id.btnPrevvi)
        tvPrevv.setOnClickListener {
            val intent = Intent(this, Memethree::class.java)
            startActivity(intent)
        }
    }
}