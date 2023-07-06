package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var tvStepTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tvStepTwo=findViewById(R.id.btnStepTwo)
        tvStepTwo.setOnClickListener {
            val intent=Intent(this,Memethree::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev=findViewById(R.id.btnPrev)
        tvPrev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}