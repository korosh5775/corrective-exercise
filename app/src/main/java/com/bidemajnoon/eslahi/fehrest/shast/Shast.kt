package com.bidemajnoon.eslahi.fehrest.shast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bidemajnoon.eslahi.R

class Shast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fehrest_main)
        lateinit var img : ImageView
        lateinit var txt : TextView

        img = findViewById(R.id.imageView)
        img.setImageResource(R.drawable.shast)//it must to change

        txt = findViewById(R.id.textView)
        txt.setText(R.string.areze_shast)//it must to change

        lateinit var  ellatbtn : Button
        ellatbtn =findViewById(R.id.ellat)
        ellatbtn.setOnClickListener { startActivity(Intent(this , Ellat::class.java)) }

        lateinit var  testbtn : Button
        testbtn =findViewById(R.id.test)
        testbtn.setOnClickListener { startActivity(Intent(this , Test::class.java)) }

        lateinit var  narmeshbtn : Button
        narmeshbtn =findViewById(R.id.narmesh)
        narmeshbtn.setOnClickListener { startActivity(Intent(this , Narmesh::class.java)) }
    }
}