package com.bidemajnoon.eslahi.fehrest.poshtegerd

import android.app.Service
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bidemajnoon.eslahi.R

class PoshteGerd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fehrest_main)

        lateinit var img : ImageView
        lateinit var txt : TextView

        img = findViewById(R.id.imageView)
        img.setImageResource(R.drawable.poshte_gerd)//it must to change

        txt = findViewById(R.id.textView)
        txt.setText(R.string.areze_poshte_gerd)//it must to change

        lateinit var  ellatbtn : Button
        ellatbtn =findViewById(R.id.ellat)
        ellatbtn.setOnClickListener { startActivity(Intent(this , Ellat::class.java)) }

        lateinit var  testbtn : Button
        testbtn =findViewById(R.id.test)
        testbtn.setOnClickListener { startActivity(Intent(this , Test::class.java)) }

        lateinit var  narmeshbtn : Button
        narmeshbtn =findViewById(R.id.narmesh)
        narmeshbtn.setOnClickListener {
            if(isConnected()){}
            else{ Toast.makeText(this , getString(R.string.check_connction) , Toast.LENGTH_SHORT).show()}
            startActivity(Intent(this , Narmesh::class.java))

        }

    }

    var context = this
    var conectivity : ConnectivityManager? = null
    var info : NetworkInfo? = null
    fun isConnected(): Boolean{
        conectivity = context.getSystemService(Service.CONNECTIVITY_SERVICE) as ConnectivityManager
        if(conectivity != null){
            info = conectivity!!.activeNetworkInfo

            if(info != null){
                if(info!!.state == NetworkInfo.State.CONNECTED){
                    return true
                }
            }
        }
        return false
    }
}