package com.sto_opka91.exchangerates.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sto_opka91.exchangerates.R
import com.sto_opka91.exchangerates.databinding.ItemMoneyLayoutBinding
import com.sto_opka91.exchangerates.model.cash.CashItem

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder> (){
    var listStart = emptyList<CashItem>()
    lateinit var hbinding: ItemMoneyLayoutBinding
    class StartViewHolder(view:View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        hbinding = ItemMoneyLayoutBinding.inflate(inflater,parent,false)
        return StartViewHolder(hbinding.root)
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.apply {
            hbinding.itemCcy.text = listStart[position].ccy
            hbinding.itemBuy.text = listStart[position].buy
            hbinding.itemSale.text = listStart[position].sale
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>){
        listStart = list
        notifyDataSetChanged()
    }
}