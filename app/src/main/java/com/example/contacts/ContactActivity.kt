package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContactActivity : AppCompatActivity() {
    private lateinit var iconTextView: TextView;
    private lateinit var nameTextView: TextView;
    private lateinit var emailTextView: TextView;
    private lateinit var phoneNumberTextView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val bundle = intent.extras;
        iconTextView = findViewById(R.id.icon);
        nameTextView = findViewById(R.id.name);
        emailTextView = findViewById(R.id.email);
        phoneNumberTextView = findViewById(R.id.phoneNumber);
        val firstName = bundle?.getString("firstName", "");
        val lastName = bundle?.getString("lastName", "");
        val phoneNumber = bundle?.getString("phoneNumber", "");
        val email = bundle?.getString("email", "");

        iconTextView.text = "${firstName?.firstOrNull()?.toString() ?: ""} ${lastName?.firstOrNull()?.toString() ?: ""}"
        nameTextView.text = "${firstName} ${lastName}"
        emailTextView.text = email;
        phoneNumberTextView.text =phoneNumber;

    }
}