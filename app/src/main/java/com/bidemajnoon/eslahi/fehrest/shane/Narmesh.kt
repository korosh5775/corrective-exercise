package com.bidemajnoon.eslahi.fehrest.shane

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
        narmeshs.add(DataModel("https://uupload.ir/files/jq18_shane1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/dyll_shane2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/n68s_shane3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/sw9b_shane4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/d7m6_shane5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/kvq_shane6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/vm6q_shane7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/cp86_shane8.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/fr6b_shane10.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
            }
        }))
    }
}
