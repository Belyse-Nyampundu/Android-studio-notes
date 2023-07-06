package com.nbelyse.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import com.nbelyse.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clearErrorsOnType()
    }
//    click ctrl alt l



    fun clearErrorsOnType(){
        binding.etNum1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?,start: Int,count: Int,after:Int){

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilNum1.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
        binding.etNum2.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           binding.tilNum2.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
    override fun onResume() {
        super.onResume()
       binding. btnAdd.setOnClickListener {
           calculation('+')
        }
      binding.  btnModulus.setOnClickListener {
          calculation('%')
        }
      binding.  btnSub.setOnClickListener {
          calculation('-')
        }
      binding.  btnMulti.setOnClickListener {
          calculation('*')
        }
    }
    fun calculation(operator: Char){
        binding.tilNum1.error = null
        binding.tilNum2.error = null
        val num1 = binding.etNum1.text.toString()
        val num2 =binding.etNum2.text.toString()
        var error = false

        if (num1.isBlank()) {
            binding.tilNum1.error = "num1 required"
            error = true
        }

        if (num2.isBlank()) {
            binding.tilNum2.error = "num2 required"
            error = true
        }

        if (!error) {
            val firstNum = num1.toDouble()
            val secondNum = num2.toDouble()
            var result = when (operator) {
                '+' -> firstNum + secondNum
                '-' -> firstNum - secondNum
                '*' -> firstNum * secondNum
                '%' -> firstNum % secondNum
                else -> throw Exception("Invalid operator")
            }
            binding.tvResult.text = result.toString()
        }
    }

}

