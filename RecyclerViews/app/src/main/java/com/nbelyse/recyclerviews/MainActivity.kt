package com.nbelyse.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nbelyse.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNameList()
    }
    fun displayNameList(){
        var names = listOf("Mary","Purity","Rachel","Esther","Pauline","Valary","Rita","kisumu","Anitha","kirezi",
        "Mugabo","pasifique","cartoon","Tedy","Bear","Mpirwa","John","Gael","Zaninka","Matwi","Joel","Rita",
        "Unice","Sonia","Pauline","snaida","Angela")
        binding.rvNames.layoutManager =LinearLayoutManager(this)
        //GridLayoutManager for columns it goes with spanCount
        //LinearLayoutManager.HORIZONTAL,false
        //spanCount:4 for columns
        val namesAdapter = NamesRvAdapter(names)
        binding.rvNames.adapter = namesAdapter
    }
}