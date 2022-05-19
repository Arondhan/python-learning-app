package com.example.begpy

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat

class Layout123 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout123)

        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_NO
        );
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    this,
                    R.color.steel_blue
                )
            )
        )
        supportActionBar?.title = "Выберите урок"
    }

    fun lesson1(view: View)
    {
        val randomIntent = Intent(this, lesson1::class.java)
        startActivity(randomIntent)
    }
    fun lesson2(view: View)
    {
        val randomIntent = Intent(this, lesson2::class.java)
        startActivity(randomIntent)
    }
    fun lesson3(view: View)
    {
        val randomIntent = Intent(this, lesson3::class.java)
        startActivity(randomIntent)
    }

}
