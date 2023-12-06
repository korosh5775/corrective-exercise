package com.bidemajnoon.eslahi.fehrest.lagan

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
        narmeshs.add(DataModel("https://uupload.ir/files/8vmg_lagan1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/q91e_lagan2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/2f9e_lagan3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/62bz_lagan4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/p9pq_lagan5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/e1_lagan6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/o3dq_lagan7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/5311_lagan8.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
            }
        }))
    }
}
