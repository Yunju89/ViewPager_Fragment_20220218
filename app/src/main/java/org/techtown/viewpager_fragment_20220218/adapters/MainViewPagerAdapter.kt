package org.techtown.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.techtown.viewpager_fragment_20220218.fragments.*

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }
//                        각 포지션에 어떤 프래그먼트 나가?
    override fun getItem(position: Int): Fragment {

        return when (position){
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> HelloFragment()
        }
    }
}

