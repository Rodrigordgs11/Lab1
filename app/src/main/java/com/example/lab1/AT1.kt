package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)
        setTitle(R.string.AT1_title)

        val redirectToAT2: Button = findViewById(R.id.go_to_AT2)
        redirectToAT2.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}