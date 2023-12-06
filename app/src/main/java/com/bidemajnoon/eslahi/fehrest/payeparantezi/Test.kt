package com.bidemajnoon.eslahi.fehrest.payeparantezi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bidemajnoon.eslahi.R

class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ellat_and_test)

        lateinit var testtxt : TextView

        testtxt = findViewById(R.id.txt_ellat_and_test)
        testtxt.setText(R.string.test_paye_parantezi)

    }
}