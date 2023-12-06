package com.bidemajnoon.eslahi.fehrest.garddanekaj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bidemajnoon.correctivebodymovements.RecyclerView.CustomAdapter
import com.bidemajnoon.correctivebodymovements.RecyclerView.DataModel
import com.bidemajnoon.eslahi.R

class Narmesh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.narmesh_recy)

        lateinit var  recy : RecyclerView

        recy = findViewById(R.id.recy)


        recy.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        val narmeshs = ArrayList<DataModel>()
        narmeshs.add(DataModel("https://uupload.ir/files/w0we_gardanekaj1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/3qvk_gardanekaj2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/xnow_gardanekaj3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/ldxp_gardanekaj4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/5r2_gardanekaj5.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {


            }
        }))
    }
}
