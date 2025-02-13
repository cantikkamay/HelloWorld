package com.cantikka.helloworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener(View.OnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if ((username == "Cantikka" || username == "Richo") && password == "12345") {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
