package com.bidemajnoon.eslahi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class Bmr : AppCompatActivity() {

    lateinit var  weight : EditText
    lateinit var height : EditText
    lateinit var age: EditText
    @SuppressLint("SetTextI18n", "DefaultLocale")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmr)

        weight = findViewById(R.id.weight2)
        height = findViewById(R.id.height2)
        age  = findViewById(R.id.age2)
        val resault : TextView = findViewById(R.id.resault)
        val calculate : Button = findViewById(R.id.calculate)
        val male : CheckBox = findViewById(R.id.male)
        val female : CheckBox = findViewById(R.id.female)
        var bmr:Double


        male.setOnClickListener {
            male.setChecked(true)
            female.setChecked(false)
        }
        female.setOnClickListener {
            male.setChecked(false)
            female.setChecked(true)
        }
        calculate.setOnClickListener{
            if(weight.text.isNotEmpty() && height.text.isNotEmpty() && age.text.isNotEmpty()){

                val vazn : Double = String.valueOf(weight.getText()).toDouble()
                val ghad : Double = String.valueOf(height.getText()).toDouble()
                val sen : Double = String.valueOf(age.getText()).toDouble()

            if(ghad >= 210 || ghad <= 10 || vazn >= 160 || sen >= 120){
                Toast.makeText(applicationContext , getString(R.string.correct_value) , Toast.LENGTH_SHORT).show()
            }else{
                if(male.isChecked) {

                    bmr = 13.397 * vazn + 4.799 * ghad - 5.677 * sen + 88.362
                    var bmr2:kotlin.String = String.format("%.2f" , bmr)
                    resault.setText(getString(R.string.calories_one) + bmr2 + getString(R.string.calories_two))
                }
                if(female.isChecked){

                    bmr = 9.247 * vazn + 3.098 * ghad - 4.330 * sen + 447.593
                    var bmr2:kotlin.String = String.format("%.2f" , bmr)
                    resault.setText(getString(R.string.calories_one) + bmr2+ getString(R.string.calories_two))
                }

            }
        }else{
            Toast.makeText(applicationContext , getString(R.string.enter_values) , Toast.LENGTH_SHORT).show()
        }

        }

    }
}




        /*val sex = arrayOf("مرد" , "زن")
        val ArrayAdapter = ArrayAdapter(this , android.R.layout.simple_spinner_item , sex)

        spinner.adapter = ArrayAdapter
        spinner.onItemSelectedListener = object:

            AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {



                when(sex[position]){
                    sex[0] ->{
                         val bmr:Double  = 66+(13.7 * vazn) + (5 * ghad)- (6.8 * sen)

                        calculate.setOnClickListener {

                            if(weight.text.isNotEmpty() && height.text.isNotEmpty() && age.text.isNotEmpty()){
                                if(ghad >= 2.1 || ghad <= 0.2 || vazn >= 160 || sen >= 90){
                                    Toast.makeText(applicationContext , "مقادیر را به صورت صحیح وارد کنید!" , Toast.LENGTH_SHORT).show()
                                }else{
                                    resault.setText("بدن شما در حالت استراحت نیاز به " + bmr.toString() + "کیلو کالری دارد")
                                }
                            }else{
                                Toast.makeText(applicationContext , "مقادیر را وارد کنید!" , Toast.LENGTH_SHORT).show()
                            }

                        }
                    }

                    sex[1] ->{
                       val bmr2:Double = 655 + (9.6 * vazn) + (1.8 * ghad) - (4.7 * sen)

                        calculate.setOnClickListener {

                            if(weight.text.isNotEmpty() && height.text.isNotEmpty() && age.text.isNotEmpty()){
                                if(ghad >= 2.1 || ghad <= 0.2 || vazn >= 160 || sen >= 90){
                                    Toast.makeText(applicationContext , "مقادیر را به صورت صحیح وارد کنید!" , Toast.LENGTH_SHORT).show()
                                }else{
                                    resault.setText("بدن شما در حالت استراحت نیاز به " + bmr2.toString() + "کیلو کالری دارد")
                                }
                            }else{
                                Toast.makeText(applicationContext , "مقادیر را وارد کنید!" , Toast.LENGTH_SHORT).show()
                            }

                        }
                    }
                }
            }
        }

        calculate.setOnClickListener {

            Toast.makeText(this , "مقادیر را وارد کنید!" , Toast.LENGTH_SHORT).show()

        }*/



