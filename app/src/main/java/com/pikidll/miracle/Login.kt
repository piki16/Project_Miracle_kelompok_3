package com.pikidll.miracle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val pindah = findViewById<View>(R.id.tv_blmpunyaakun)

        pindah.setOnClickListener{
            startActivity(Intent(applicationContext,Register::class.java))
        }
    }
}