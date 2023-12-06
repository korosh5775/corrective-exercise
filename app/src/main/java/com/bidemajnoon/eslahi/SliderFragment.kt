package com.bidemajnoon.eslahi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_slider.*

class SliderFragment  : Fragment(){
    var pageTitle : String = ""
    var imsge1 : Int = R.drawable.pasture

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_slider, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragment_title.text = pageTitle
        image_title.setImageResource(imsge1)
    }
    fun setTitle(title: String , image: Int){
        pageTitle = title
        imsge1 =image
    }
}