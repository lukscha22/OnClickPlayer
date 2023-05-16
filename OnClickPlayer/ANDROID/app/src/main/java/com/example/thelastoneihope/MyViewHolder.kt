package com.example.thelastoneihope

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.textViewRec)
    val button: Button = itemView.findViewById(R.id.buttonRec)
}
