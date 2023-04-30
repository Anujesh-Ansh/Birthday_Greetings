package com.myonir.birthday_greetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    // use private lateinit var -> to globalize a variable

    private lateinit var nameText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameText = findViewById<EditText>(R.id.nameText)


    }
    // writing (view:View) in a function is important or else it won't work
    fun createBirthdayCard(view: View) {

        // toast is like a small notification on the screen

        val name = nameText.editableText.toString()

        Toast.makeText(this,"Button was Clicked by $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this,Greeting_Page::class.java)

        intent.putExtra(Greeting_Page.NAME_EXTRA,name)

        startActivity(intent)
    }
}