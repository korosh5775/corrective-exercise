package com.bidemajnoon.eslahi.fehrest.kafegod

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

        narmeshs.add(DataModel("https://uupload.ir/files/tbc9_kafegod1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/sha1_kafegod2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/6vnp_kafegod3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/e8ui_kafegod4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/dkaf_kafegod5.gif"))



        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {

            }
        }))
    }
}
