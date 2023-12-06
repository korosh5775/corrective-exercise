package com.bidemajnoon.eslahi.fehrest.poshtekaj

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
        narmeshs.add(DataModel("https://uupload.ir/files/ml05_poshtekaj1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/icjd_poshtekaj2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/tm2i_poshtekaj3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/ofpy_poshtekaj4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/gmne_poshtekaj5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/dup2_poshtekaj7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/vv5l_poshtekaj8.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
            }
        }))
    }
}
