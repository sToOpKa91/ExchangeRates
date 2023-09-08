package com.sto_opka91.exchangerates.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sto_opka91.exchangerates.R
import com.sto_opka91.exchangerates.model.cash.CashItem
import com.sto_opka91.exchangerates.model.non_cash.NonCashItem

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){
    var listSecond = emptyList<NonCashItem>()
    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.apply {
            val itemTitle = findViewById<TextView>(R.id.item_ccy)
            val itemBuy = findViewById<TextView>(R.id.item_buy)
            val itemSale = findViewById<TextView>(R.id.item_sale)
            itemTitle.text = listSecond[position].ccy
            itemBuy.text = listSecond[position].buy
            itemSale.text = listSecond[position].sale
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NonCashItem>){
        listSecond = list
        notifyDataSetChanged()
    }
}