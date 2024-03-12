package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)
        setTitle(R.string.AT2_title)

        val redirectToAT1: Button = findViewById(R.id.go_to_AT1)
        redirectToAT1.setOnClickListener {
            val intent = Intent(this, AT1::class.java)
            startActivity(intent)
        }
    }
}