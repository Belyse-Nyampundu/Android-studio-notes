package com.nbelyse.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nbelyse.twitterclone.databinding.ActivityMainBinding
import com.nbelyse.twitterclone.databinding.TweetListItemBinding

class TweetsRvAdapter (var tweetsList:List<TweetData>):RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
    var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context)
        ,parent,false)
        return TweetsViewHolder(binding)

    }

    override fun getItemCount(): Int {
      return tweetsList.size
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
    var tweet = tweetsList[position]


        holder.binding.apply {
          tvDisplayName.text = tweet.displayName
        tvHandle.text = tweet.handle
         tvTweet.text = tweet.tweet
       tvLikeCount.text = tweet.likeCount.toString()
       tvRtCount.text = tweet.rtCount.toString()
          tvReplyCount.text = tweet.replyCount.toString()

        }
    }


}
class TweetsViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root){

}