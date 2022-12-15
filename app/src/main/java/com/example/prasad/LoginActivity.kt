package com.example.prasad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var txtRegister:TextView
    lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtRegister = findViewById(R.id.txtRegister)
        login = findViewById(R.id.btnLogin)

        txtRegister.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

        login.setOnClickListener {
            startActivity(Intent(this,UserDashboard::class.java))
        }


    }
}