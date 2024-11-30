package com.indah.goodfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.R
import com.indah.goodfood.adapter.AdapterMakanan.MyViewHolder
import com.indah.goodfood.model.ModelEksplor
import com.indah.goodfood.model.ModelMinuman

class AdapterEksplor(
    val itemEkplor : List<ModelEksplor>
): RecyclerView.Adapter<AdapterEksplor.MyViewHolder>() {
    class  MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgMakananEkplor : ImageView = itemView.findViewById(R.id.imgMakananeks)
        var txtMakananEkplor : TextView = itemView.findViewById(R.id.txtNamaeks)
        var txtHargaEkplor : TextView = itemView.findViewById(R.id.txtHargaeks   )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_eksplor,parent,false)
        return AdapterEksplor.MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemEkplor.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemEkplor[position]
        holder.imgMakananEkplor.setImageResource(currentItem.imgMakananEks)
        holder.txtMakananEkplor.text = currentItem.namaMakananEks
        holder.txtHargaEkplor.text = currentItem.hargaMakananEks
    }
}