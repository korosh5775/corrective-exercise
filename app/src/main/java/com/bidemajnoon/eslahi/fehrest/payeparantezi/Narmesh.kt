package com.bidemajnoon.eslahi.fehrest.payeparantezi

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
        narmeshs.add(DataModel("https://uupload.ir/files/99u2_parantezi1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/psni_parantezi2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/gl72_parantezi3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/4bj_parantezi4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/o411_parantezi5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/4qg_parantezi6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/i3ex_parantezi7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/y8o_parantezi8.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/id64_parantezi9.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {

            }
        }))
    }
}
