package com.bidemajnoon.eslahi

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import com.bidemajnoon.eslahi.fehrest.payeparantezi.PayeParantezi
import com.bidemajnoon.eslahi.fehrest.payex.PayeX
import com.bidemajnoon.eslahi.fehrest.poshtegerd.PoshteGerd
import com.bidemajnoon.eslahi.fehrest.poshtegod.PoshteGod
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var backPressedTime  = 0L
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this )
        loadeLocate()

        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
        lateinit var mInterstitialAd: InterstitialAd
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-4150165940268083/7087123696"
        mInterstitialAd.loadAd(AdRequest.Builder().build())


        val adRequest2 = AdRequest.Builder().build()
        adView2.loadAd((adRequest2))
        lateinit var mInterstitialAd2: InterstitialAd
        mInterstitialAd2 = InterstitialAd(this)
        mInterstitialAd2.adUnitId = "ca-app-pub-4150165940268083/7087123696"
        mInterstitialAd2.loadAd(AdRequest.Builder().build())

        MobileAds.initialize(this)
        lateinit var mInterstitialAd4: InterstitialAd
        mInterstitialAd4 = InterstitialAd(this)
        mInterstitialAd4.adUnitId = "ca-app-pub-4150165940268083/3287479484"
        mInterstitialAd4.loadAd(AdRequest.Builder().build())

        MobileAds.initialize(this)
        lateinit var mInterstitialAd0: InterstitialAd
        mInterstitialAd0 = InterstitialAd(this)
        mInterstitialAd0.adUnitId = "ca-app-pub-4150165940268083/3287479484"
        mInterstitialAd0.loadAd(AdRequest.Builder().build())






        lateinit var bmi : TextView
        lateinit var bmr : TextView
        lateinit var fehrest : TextView
        lateinit var about : TextView
        lateinit var popup : ImageView


        bmi = findViewById(R.id.textView5)
        bmr = findViewById(R.id.metacal)
        fehrest = findViewById(R.id.textView15)
        about = findViewById(R.id.textView12)
        popup = findViewById(R.id.popup)


        bmi.setOnClickListener {
            if(mInterstitialAd0.isLoaded){
                mInterstitialAd0.show()
            }
            startActivity(Intent(this , Bmi::class.java))
        }
        bmr.setOnClickListener {
            startActivity(Intent(this , Bmr::class.java))
        }
        fehrest.setOnClickListener {
            if(mInterstitialAd4.isLoaded){
                mInterstitialAd4.show()
            }
            startActivity(Intent(this , Fehrest::class.java))
        }
        about.setOnClickListener {
            startActivity(Intent(this , About::class.java))
        }

        //continue
        lateinit var  poshtegerd : CardView
        lateinit var poshtegod : CardView
        lateinit var payex : CardView
        lateinit var payeparantezi : CardView

        poshtegerd = findViewById(R.id.cardView)
        poshtegod = findViewById(R.id.cardView2)
        payex = findViewById(R.id.cardView3)
        payeparantezi = findViewById(R.id.cardView4)

        poshtegerd.setOnClickListener { startActivity(Intent(this , PoshteGerd::class.java)) }
        poshtegod.setOnClickListener { startActivity(Intent(this , PoshteGod::class.java)) }
        payex.setOnClickListener { startActivity(Intent(this , PayeX::class.java)) }
        payeparantezi.setOnClickListener { startActivity(Intent(this , PayeParantezi::class.java)) }


        var textBmiSize :TextView = findViewById(R.id.textView4)



        //option menu
        popup.setOnClickListener{
            val popup = PopupMenu(this , popup)
            popup.inflate(R.menu.menu)
            popup.setOnMenuItemClickListener {
                when(it?.itemId){

                    //connect item
                    R.id.item_connect_us ->{
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse("sms:+989196682836")
                        intent.putExtra("sms_body", "سلام.\n")
                        startActivity(intent)
                        true
                    }

                    //language item
                    R.id.item_language -> {
                        val listItems = arrayOf("فارسی", "English")
                        val mBuilder = AlertDialog.Builder(this)
                        mBuilder.setTitle("Choose language:")
                        mBuilder.setSingleChoiceItems(listItems, -1) { dialog, which ->
                            when (which){
                                0 ->{
                                    setlacate("fa")
                                    recreate()
                                }
                                1 ->{
                                    setlacate("en")
                                    recreate()
                                }
                            }

                            dialog.dismiss()
                        }
                        val mdialog = mBuilder.create()
                        mdialog.show()
                        true

                    }

                    //cloze item
                    R.id.item_close -> {
                        finish()
                        true
                    }
                    else -> true
                }//end of when
            }//end of popup on click
            popup.show()
        }//end of popup

    }//end of onCreate
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


    //set language for default in future

    override fun onBackPressed() {

        if(backPressedTime +2000 > System.currentTimeMillis()){
            super.onBackPressed()
        }else{
            Toast.makeText(baseContext , getString(R.string.back) , Toast.LENGTH_SHORT).show()

        }
        backPressedTime  = System.currentTimeMillis()



    }
}