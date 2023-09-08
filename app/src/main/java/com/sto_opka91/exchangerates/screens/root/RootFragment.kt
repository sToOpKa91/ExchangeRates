package com.sto_opka91.exchangerates.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.sto_opka91.exchangerates.R
import com.sto_opka91.exchangerates.ViewPagerAdapter
import com.sto_opka91.exchangerates.databinding.FragmentRootBinding


class RootFragment : Fragment() {
    lateinit var rBinding: FragmentRootBinding
    private var ctx: Context?= null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rBinding = FragmentRootBinding.inflate(inflater, container, false)
        rBinding.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        return rBinding.root
    }

}