package com.example.startstudent

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(list:ArrayList<Fragment>,fm:FragmentManager,lifecycle: Lifecycle):
    FragmentStateAdapter(fm,lifecycle) {
    val fragmentList=list;
    override fun getItemCount(): Int {

        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }


}