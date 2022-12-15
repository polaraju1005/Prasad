package com.example.prasad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        android.os.Handler().postDelayed(Runnable { display() },2000)

    }
    private fun display(){
        startActivity(Intent(this,LoginActivity::class.java))
        finish()
    }
}