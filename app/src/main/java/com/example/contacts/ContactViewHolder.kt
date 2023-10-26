package com.example.contacts

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    val iconTextView: TextView = itemView.findViewById(R.id.icon)
    val nameTextView: TextView = itemView.findViewById(R.id.name)
    val containerView: LinearLayout = itemView.findViewById(R.id.contact)
}