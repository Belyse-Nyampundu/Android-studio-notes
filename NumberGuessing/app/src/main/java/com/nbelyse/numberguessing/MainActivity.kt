package com.nbelyse.numberguessing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.graphics.Color
import com.nbelyse.numberguessing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private  lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        assignNumbersToButtons()
        binding.tvScore.text = "0"
        binding.btnLeft.setOnClickListener {
            // When left button click
            checkAnswer(true)
            // 2. pick the new random number
            assignNumbersToButtons()
        }
        binding.btnRight.setOnClickListener {
            checkAnswer(false)
            assignNumbersToButtons()
        }
        binding.btnButtom.setOnClickListener {
            binding.tvScore.text = "0"
            assignNumbersToButtons()
            binding.backgroundView.setBackgroundColor(Color.WHITE)
        }
    }
    private fun checkAnswer(isLeftBtnSelected: Boolean) {
        val leftNumber = binding.btnLeft.text.toString().toInt()
        val rightNumber = binding.btnRight.text.toString().toInt()
        val isAnswerCorrect: Boolean =
            if (isLeftBtnSelected) leftNumber > rightNumber else leftNumber < rightNumber

        if (isAnswerCorrect) {
            val correctScore = binding.tvScore.text.toString().toInt() + 1
            binding.tvScore.text = correctScore.toString()
            binding.backgroundView.setBackgroundColor(Color.GREEN)
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show()
        } else {
            val correctScore = binding.tvScore.text.toString().toInt() - 1
            if (correctScore < 0) binding.tvScore.text = "0" else binding.tvScore.text =
                correctScore.toString()
            binding.backgroundView.setBackgroundColor(Color.RED)
            Toast.makeText(this, "Wrong Answer!", Toast.LENGTH_SHORT).show()
        }
    }
        private fun assignNumbersToButtons() {

            val leftRandomNumber = (0..10).random()
            var rightRandomNumber = leftRandomNumber
            while (leftRandomNumber == rightRandomNumber) {
                rightRandomNumber = (0..10).random()
            }
            // set pick random number
            binding.btnLeft.text = leftRandomNumber.toString()
            binding.btnRight.text = rightRandomNumber.toString()


        }

    }