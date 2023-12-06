package com.bidemajnoon.eslahi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class Bmi : AppCompatActivity() {

    lateinit var ghad : EditText
    lateinit var vazn : EditText
    lateinit var calculate2 : Button
    lateinit var resault1 : TextView
    lateinit var resault2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)
        resault1 = findViewById(R.id.resault)
        resault2 = findViewById(R.id.resault2)
        ghad = findViewById(R.id.weight2)
        vazn = findViewById(R.id.vazn)
        calculate2 = findViewById(R.id.calculate2)
        calculate2.setOnClickListener {
            if (ghad.text.isNotEmpty() && vazn.text.isNotEmpty()){
                val numberOfGhad : Float = String.valueOf(ghad.getText()).toFloat()
                val numberOfVazn : Float = String.valueOf(vazn.getText()).toFloat()
                if(numberOfGhad >= 210 || numberOfGhad <= 10 || numberOfVazn >= 160 ){
                    Toast.makeText(this , getString(R.string.correct_value) , Toast.LENGTH_SHORT).show()


                }else{
                    val resault :Float = numberOfVazn / ((numberOfGhad / 100) * (numberOfGhad / 100))

                    resault1.setText(getString(R.string.bmi_resault)+ resault.toString())
                    if (resault < 18.5){
                        resault2.setText(R.string.laghar)
                    }else if(resault >= 18.5 && resault < 25){
                        resault2.setText(R.string.tabiei)
                    }else if(resault >= 25 && resault < 30){
                        resault2.setText(R.string.ezafevazn)
                    }else if(resault >= 30){
                        resault2.setText(R.string.chagh)
                    }
                }


            }else Toast.makeText(this , getString(R.string.enter_values), Toast.LENGTH_SHORT).show()
        }

    }
}