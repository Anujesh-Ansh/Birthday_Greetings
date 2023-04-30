package com.myonir.birthday_greetings

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greeting_Page : AppCompatActivity() {

    companion object{ // making constant variables for keys
        const val NAME_EXTRA = "name_extra"
    }

    private lateinit var birthdayGreet: TextView

    // always necessary to use findViewById

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_page)

        birthdayGreet = findViewById(R.id.birthdayGreet)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreet.text = "Happy Birthday $name !!!"

    }
}

