package com.bidemajnoon.eslahi

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fade_in.*
import java.util.*

class FadeIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        loadeLocate()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fade_in)

            object : CountDownTimer(5000, 1000) {
                override fun onTick(millisUntilFinished: Long) {}

                override fun onFinish() {
                    //set the new Content of your activity
                    val shared = getSharedPreferences("Prefs", Context.MODE_PRIVATE)
                    val editor = shared.edit()
                    val isFirstRun = shared.getBoolean("FIRSTRUN", true)
                    if (isFirstRun) {


                        startActivity(Intent(this@FadeIn, SetLanguage::class.java))
                        // Code to run once
                        editor.putBoolean("FIRSTRUN", false)
                        editor.apply()
                    }else{

                        startActivity(Intent(this@FadeIn, MainActivity::class.java))
                    }

                }
            }.start()

            val animation = AnimationUtils.loadAnimation(this,
                R.anim.fade_in
            )
            bide_majnoon.startAnimation(animation)
        }


    fun loadeLocate(){
        val sharedPreferences = getSharedPreferences("settings" , Activity.MODE_PRIVATE)
        val language = sharedPreferences.getString("My_Lang" , "en")
        setlacate(language)
    }
    private fun setlacate(Lang: String?){
        val locale = Locale(Lang)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config , baseContext.resources.displayMetrics)
        val editor = getSharedPreferences("settings"  , Context.MODE_PRIVATE).edit()
        editor.putString("My_Lang" , Lang)
        editor.apply()
    }
        override fun onStop() {
            super.onStop()
            finish()
        }

    }
