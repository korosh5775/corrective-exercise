package com.bidemajnoon.eslahi.fehrest.poshtegerd

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
        narmeshs.add(DataModel("https://uupload.ir/files/ezmj_poshtegerd1.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/wkyo_poshtegerd2.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/cwu2_poshtegerd3.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/4nje_poshtegerd4.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/tlv1_poshtegerd5.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/xhr_poshtegerd6.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/33mu_poshtegerd7.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/nd6r_poshtegerd8.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/c42i_poshtegerd9.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/kk0i_poshtegerd10.gif"))
        narmeshs.add(DataModel("https://uupload.ir/files/tl1o_poshtegerd11.gif"))




        recy.setAdapter(CustomAdapter(packageName, applicationContext, numbers = ArrayList(narmeshs), listener =object : CustomAdapter.OnItemClickListener {
            override fun onItemClick(guide: DataModel) {
               /* when(guide){//here I can set Items to click
                   *//* narmeshs[0]->{

                    }
                    narmeshs[1]->{

                    }
                    narmeshs[2]->{

                    }
                    narmeshs[3]->{

                    }*//*



                }*/


            }
        }))
    }
}