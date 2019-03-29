package com.example.android_with_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val a = intent.getStringExtra("NAME")
        val b = intent.getStringExtra("DETAILS")

        val c = " $a says about nature that  $b"

        textView.text=c
    }
}
