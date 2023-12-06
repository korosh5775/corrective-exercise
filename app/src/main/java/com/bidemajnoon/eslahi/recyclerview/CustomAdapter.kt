package com.bidemajnoon.correctivebodymovements.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bidemajnoon.eslahi.R
import com.bumptech.glide.Glide


public class CustomAdapter(
    val packageName: String,
    val applicationContext: Context ,
    var numbers: ArrayList<DataModel>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {


    //define Constructor



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(
                R.layout.narmesh_example2,
                parent,
                false
            )
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(numbers[position], listener )



    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    interface OnItemClickListener {
        fun onItemClick(guide: DataModel)

    }


    inner class MyViewHolder(view: View ) : RecyclerView.ViewHolder(view) {
        /*var videosample: VideoView*/
        var gifsample : ImageView
        init {
            gifsample = view.findViewById(R.id.gif) as ImageView

        }




        fun bind(item: DataModel, listener: OnItemClickListener ) {
            /*gifsample.setImageResource(item.gif1)*/

            Glide.with(applicationContext).load(item.gif1).into(gifsample)
            /*videosample.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + item.video1))
            videosample.start()
            videosample.setOnCompletionListener { videosample.start() }
            videosample.setOnClickListener { videosample.start() }*/
            itemView.setOnClickListener { listener.onItemClick(item) }
        }
    }


}

