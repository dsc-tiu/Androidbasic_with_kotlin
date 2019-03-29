package com.example.android_with_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val a = editText.text.toString()
            val b = edittext1.text.toString()
            
            val intent = Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("NAME",a)
            intent.putExtra("DETAILS",b)
            startActivity(intent)
        }
    }
}
