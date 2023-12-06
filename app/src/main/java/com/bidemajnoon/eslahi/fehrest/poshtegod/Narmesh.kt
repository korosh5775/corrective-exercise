package com.bidemajnoon.eslahi.fehrest.poshtegod

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
        narmeshs.add(DataModel("https://uupload.ir/files/6776_poshtegod1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/6q5y_poshtegod2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/ong6_poshtegod3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/uyxm_poshtegod4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/6tp_poshtegod5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/uiwp_poshtegod6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/jagb_poshtegod7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/6b60_poshtegod8.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/bkmf_poshtegod9.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/f38s_poshtegod10.gif"))





        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
            }
        }))
    }
}
