package com.cantikka.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val openingTextView = findViewById<TextView>(R.id.opening)
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        val username = intent.getStringExtra("username")

        if (username != null) {
            openingTextView.text = "Selamat Datang, $username!"
        } else {
            openingTextView.text = "Selamat Datang!"
        }

        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
