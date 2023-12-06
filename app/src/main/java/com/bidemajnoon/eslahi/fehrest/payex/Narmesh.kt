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





        /*lateinit var video : VideoView
        video = findViewById(R.id.videoView)
        video.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.drawable.zarbdari1))
        video.start()
        video.setOnCompletionListener { video.start() }

        lateinit var video1 : VideoView
        video1 = findViewById(R.id.videoView5)
        video1.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.drawable.zarbdari2))
        video1.start()
        video1.setOnCompletionListener { video1.start() }

        lateinit var video2 : VideoView
        video2 = findViewById(R.id.videoView2)
        video2.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.drawable.zarbdari3))
        video2.start()
        video2.setOnCompletionListener { video2.start() }

        lateinit var video3 : VideoView
        video3= findViewById(R.id.videoView3)
        video3.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.drawable.zarbdari4))
        video3.start()
        video3.setOnCompletionListener { video3.start() }

        *//*video4.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.drawable.zarbdari6))
        video4.start()
        video4.setOnCompletionListener { video4.start() }*/


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