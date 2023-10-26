package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ContactsViewModel>().apply {
            add(ContactsViewModel("Alice", "Johnson", "555-1234", "alice.johnson@example.com"))
            add(ContactsViewModel("Bob", "Smith", "555-5678", "bob.smith@example.com"))
            add(ContactsViewModel("Charlie", "Brown", "555-9876", "charlie.brown@example.com"))
            add(ContactsViewModel("David", "Davis", "555-4321", "david.davis@example.com"))
            add(ContactsViewModel("Emma", "Hall", "555-8765", "emma.hall@example.com"))
            add(ContactsViewModel("Frank", "Clark", "555-2345", "frank.clark@example.com"))
            add(ContactsViewModel("Grace", "Lewis", "555-7654", "grace.lewis@example.com"))
            add(ContactsViewModel("Helen", "White", "555-6789", "helen.white@example.com"))
            add(ContactsViewModel("Ivy", "Harris", "555-5432", "ivy.harris@example.com"))
            add(ContactsViewModel("Jack", "Lee", "555-7890", "jack.lee@example.com"))
        }

        val adapter = ContactAdapter(data)

        recyclerview.adapter = adapter
    }
}