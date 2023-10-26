package com.example.contacts


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val mList: List<ContactsViewModel>) : RecyclerView.Adapter<ContactViewHolder>() {
    private lateinit var context: Context;
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        this.context = parent.context;
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactsViewModel = mList[position]

        holder.iconTextView.text = "${contactsViewModel.firstName[0].uppercaseChar()}${contactsViewModel.lastName[0].uppercaseChar()}"
        holder.nameTextView.text = "${contactsViewModel.firstName} ${contactsViewModel.lastName}"
        holder.containerView.setOnClickListener {
            val intent = Intent(context, ContactActivity::class.java)
            intent.putExtra("firstName", contactsViewModel.firstName)
            intent.putExtra("lastName", contactsViewModel.lastName)
            intent.putExtra("email", contactsViewModel.email)
            intent.putExtra("phoneNumber", contactsViewModel.phoneNumber)
            context.startActivity(intent)
        }
    }

}