package com.bidemajnoon.eslahi.fehrest.sarbejelo

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
        narmeshs.add(DataModel("https://uupload.ir/files/naom_sarbejelo1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/4ljm_sarbejelo2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/rg2l_sarbejelo3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/d9cd_sarbejelo4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/7rkl_sarbejelo5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/8lls_sarbejelo6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/93r_sarbejelo7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/m26r_sarbejelo8.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/30un_sarbejelo9.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
            }
        }))
    }
}
