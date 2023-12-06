package com.bidemajnoon.eslahi.fehrest.sarbejelo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bidemajnoon.eslahi.R

class Ellat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ellat_and_test)

        lateinit var ellattxt : TextView

        ellattxt = findViewById(R.id.txt_ellat_and_test)
        ellattxt.setText(R.string.elat_sar_be_jelo)
    }
}