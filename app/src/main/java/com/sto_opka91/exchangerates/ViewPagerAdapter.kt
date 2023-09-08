package com.sto_opka91.exchangerates

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sto_opka91.exchangerates.screens.second.SecondFragment
import com.sto_opka91.exchangerates.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> StartFragment()
            else -> SecondFragment()
        }
    }

}