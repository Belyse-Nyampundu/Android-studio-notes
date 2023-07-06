package com.nbelyse.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nbelyse.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = TweetData("","Belyse","@Fire","Hello guys!!!",
            2,3,22)
        var tweet2 = TweetData("","Anitha","@Fire","Hello guys!!!",
            2,3,22)
        var tweet3 = TweetData("","Sonia","@Fire","Hello guys!!!",
            2,3,22)
        var tweet4 = TweetData("","Kevine","@Fire","Hello guys!!!",
            2,3,22)
        var tweet5 = TweetData("","Mugabo","@Fire","Hello guys!!!",
            2,3,22)
        var tweet6 = TweetData("","Pacifique","@Fire","Hello guys!!!",
            2,3,22)
    var tweetlist = listOf<TweetData>(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        var tweetsAdapter = TweetsRvAdapter(tweetlist)
        binding.rvTweets.adapter = tweetsAdapter
    }
}