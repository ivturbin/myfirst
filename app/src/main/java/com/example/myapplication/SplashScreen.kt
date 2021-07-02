package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyApplication_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        val intent = Intent(this, MainActivity::class.java)

        Handler().postDelayed(
            {
                startActivity(intent)
                finish()
            },
            2000L
        )
    }
}
