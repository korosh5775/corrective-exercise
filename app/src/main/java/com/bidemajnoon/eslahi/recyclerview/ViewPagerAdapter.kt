package com.bidemajnoon.correctivebodymovements.RecyclerView

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.*

/**
 * Created by BideMajnoon on 27-Jun-18.
 */
@Suppress("DEPRECATION")
class ViewPagerAdapter(fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!) {
    private val fragmentList: MutableList<Fragment> =
        ArrayList()
    private val fragmentListTitles: MutableList<String> =
        ArrayList()

    override fun getItem(i: Int): Fragment {
        return fragmentList[i]
    }

    override fun getCount(): Int {
        return fragmentListTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentListTitles[position]
    }

    fun AddFragment(fragment: Fragment, Title: String) {
        fragmentList.add(fragment)
        fragmentListTitles.add(Title)
    }
}