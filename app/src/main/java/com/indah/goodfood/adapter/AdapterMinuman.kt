package com.indah.goodfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.R
import com.indah.goodfood.adapter.AdapterMakanan.MyViewHolder
import com.indah.goodfood.model.ModelMakanan
import com.indah.goodfood.model.ModelMinuman

class AdapterMinuman(
    val itemMinuman : List<ModelMinuman>
): RecyclerView.Adapter<AdapterMinuman.MyViewHolder>() {
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgMinuman : ImageView = itemView.findViewById(R.id.imgMinuman)
        var txtMinuman : TextView = itemView.findViewById(R.id.txtMinuman)
        var txtHargaMinuman : TextView = itemView.findViewById(R.id.txtHargaMinuman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_beranda_minuman,parent,false)
        return AdapterMinuman.MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMinuman.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMinuman[position]
        holder.imgMinuman.setImageResource(currentItem.imgMinuman)
        holder.txtMinuman.text = currentItem.namaMinuman
        holder.txtHargaMinuman.text = currentItem.hargaMinuman
    }
}