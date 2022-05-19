package com.example.begpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card_view.*
import kotlinx.android.synthetic.main.activity_lesson4.*


class CardView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        lesson1card.setOnClickListener{
            startActivity(Intent(this,lesson1::class.java))
        }
        lesson2card.setOnClickListener{
            startActivity(Intent(this,lesson2::class.java))
        }
        lesson3card.setOnClickListener{
            startActivity(Intent(this,lesson3::class.java))
        }
        lesson4card.setOnClickListener{
            startActivity(Intent(this,lesson4::class.java))
        }
        lesson5card.setOnClickListener{
            startActivity(Intent(this,lesson5::class.java))
        }
        lesson6card.setOnClickListener{
            startActivity(Intent(this,lesson6::class.java))
        }
        lesson7card.setOnClickListener{
            startActivity(Intent(this,lesson7::class.java))
        }

        Home.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
    }


