package com.bidemajnoon.eslahi

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.best_activity.*

class Best_activity : AppCompatActivity() {

    val Fragment1 = SliderFragment()
    val Fragment2 = SliderFragment()
    val Fragment3 = SliderFragment()
    lateinit var adapter : myPagerAdapter
    lateinit var activity : Activity
    lateinit var preference : SharedPreferences
    val pref_show_intro = "Intro"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.best_activity)
        activity = this
        preference = getSharedPreferences("IntroSlider" , Context.MODE_PRIVATE)
        if(!preference.getBoolean(pref_show_intro , true)){
            startActivity(Intent(activity, MainActivity::class.java))
            finish()

        }
        Fragment1.setTitle(getString(R.string.Treatment) , R.drawable.eslahi)
        Fragment2.setTitle(getString(R.string.fat) , R.drawable.laghar)
        Fragment3.setTitle(getString(R.string.body) , R.drawable.pasture)

        adapter = myPagerAdapter(supportFragmentManager)
        adapter.list.add(Fragment1)
        adapter.list.add(Fragment2)
        adapter.list.add(Fragment3)

        view_pager.adapter = adapter

        btn_next.setOnClickListener{
            view_pager.currentItem++
        }
        btn_skip.setOnClickListener{goToDashbord()}

        view_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(p0: Int) {
                if(p0 == adapter.list.size-1){
                    btn_next.text = getString(R.string.done)
                    btn_next.setOnClickListener{
                        goToDashbord()
                    }
                }else{
                    btn_next.text = getString(R.string.next)
                    btn_next.setOnClickListener{
                        view_pager.currentItem++
                    }
                }
                when(view_pager.currentItem){
                    0->{
                        indicator1.setTextColor(Color.BLACK)
                        indicator2.setTextColor(Color.GRAY)
                        indicator3.setTextColor(Color.GRAY)
                    }
                    1->{
                        indicator1.setTextColor(Color.GRAY)
                        indicator2.setTextColor(Color.BLACK)
                        indicator3.setTextColor(Color.GRAY)
                    }
                    2->{
                        indicator1.setTextColor(Color.GRAY)
                        indicator2.setTextColor(Color.GRAY)
                        indicator3.setTextColor(Color.BLACK)
                    }
                }
            }

        })
    }
    fun goToDashbord(){
        startActivity(Intent(activity, MainActivity::class.java))
        finish()
        val editor = preference.edit()
        editor.putBoolean(pref_show_intro , false)
        editor.apply()
    }
    class myPagerAdapter(manager : FragmentManager) : FragmentPagerAdapter(manager){
        val list : MutableList<Fragment> = ArrayList()

        override fun getItem(p0: Int): Fragment {
            return list[p0]
        }

        override fun getCount(): Int {
            return list.size
        }

    }
}