package com.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRecycler (var numbers:List<Int>):RecyclerView.Adapter<DigitsHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigitsHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.digits_list,parent,false)
        return DigitsHolder(itemView)
    }

    override fun onBindViewHolder(holder: DigitsHolder, position: Int) {
       holder.tvNumbers.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}

class DigitsHolder(itemView: View): ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}