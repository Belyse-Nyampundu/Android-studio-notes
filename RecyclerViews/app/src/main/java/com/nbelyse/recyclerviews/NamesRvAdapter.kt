package com.nbelyse.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.Adapter

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesRvAdapter (var namesList:List<String>): Adapter<NamesViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
   val itemView = LayoutInflater.from(parent.context).inflate(R.layout.namelist,parent,false)
        return NamesViewHolder(itemView)
    }
//inflate takes xml file and transit to view
    //recyclerview is a view group itself
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
   val currentName = namesList.get(position)
        holder.tvName.text = currentName
    }

    override fun getItemCount(): Int {
   return namesList.size
        //it will tell the recycle view where to stop if it is 5 it will display 5 items only
    }
}
class NamesViewHolder(itemView: View):ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
}

