@file:Suppress("DEPRECATION")

package com.bidemajnoon.eslahi

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*
open class SetLanguage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_language)
        loadeLocate()


        val listItems = arrayOf("فارسی","English")
        val mBuilder = AlertDialog.Builder(this)
        mBuilder.setTitle("Choose language:")
        mBuilder.setSingleChoiceItems(listItems , -1) { dialog, which ->
            when(which){
                0->{
                    setlacate("fa")
                    val intent = Intent(this , Best_activity::class.java)
                    startActivity(intent)
                }
                1->{
                    setlacate("en")
                    val intent2 = Intent(this , Best_activity::class.java)
                    startActivity(intent2)
                }
            }

            dialog.dismiss()
        }
        val mdialog = mBuilder.create()
        mdialog.show()
    }



    fun loadeLocate(){
        val sharedPreferences = getSharedPreferences("settings" , Activity.MODE_PRIVATE)
        val language = sharedPreferences.getString("My_Lang" , "")
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
