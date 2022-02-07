package com.ir.viewpagerfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycler(val context: Context, private val arrayList: ArrayList<String>) :
    RecyclerView.Adapter<AdapterRecycler.VH>() {

    inner class VH(var itemRV: View) : RecyclerView.ViewHolder(itemRV) {
        fun onBind(string: String) {
            val itemTv = itemRV.findViewById<TextView>(R.id.item_tv)
            itemTv.text = string
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(arrayList[position])
    }

    override fun getItemCount(): Int = arrayList.size

}