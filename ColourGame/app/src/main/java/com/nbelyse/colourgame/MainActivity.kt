package com.nbelyse.colourgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbelyse.colourgame.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

   private val randomNumber = (1..100).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGuesss.setOnClickListener {
       checkNumber()
        }

    }
    private  fun checkNumber(){

        val userGuess = binding.etNumber.text.toString().toIntOrNull()

        if (userGuess != null) {
            if (userGuess == 31) {
                binding.btnGuesss.text = getString(R.string.gulmek)
            } else {
                when {
                    userGuess < randomNumber -> binding.btnGuesss.text = getString(R.string.EBG)
                    userGuess > randomNumber -> binding.btnGuesss.text = getString(R.string.ESN)
                    else -> binding.btnGuesss.text = getString(R.string.cong)
                }
            }
        } else {
            binding.btnGuesss.text = getString(R.string.EVN)
        }
    }

}





