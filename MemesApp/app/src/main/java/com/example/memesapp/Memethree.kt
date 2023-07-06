package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memethree : AppCompatActivity() {
    lateinit var tvNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        tvNext=findViewById(R.id.btnButton4)
        tvNext.setOnClickListener {
            val intent= Intent(this,Meme4::class.java)
            startActivity(intent)
        }
        lateinit var tvPrev:Button
        tvPrev=findViewById(R.id.btnButton2)
        tvPrev.setOnClickListener {
            val intent=Intent(this,Meme2::class.java)
            startActivity(intent)
        }
    }
}