package com.bidemajnoon.eslahi.fehrest.payex
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bidemajnoon.correctivebodymovements.RecyclerView.CustomAdapter
import com.bidemajnoon.correctivebodymovements.RecyclerView.DataModel
import com.bidemajnoon.eslahi.R

class Narmesh(): AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.narmesh_recy)

        lateinit var  recy : RecyclerView

        recy = findViewById(R.id.recy)


        recy.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        val narmeshs = ArrayList<DataModel>()
        narmeshs.add(DataModel("https://uupload.ir/files/4tt7_zarbdari1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/7zyr_zarbdari2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/lu2f_zarbdari3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/pcfw_zarbdari4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/epty_zarbdari6.gif"))





        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {



            }
        }))

    }
}
