package com.indah.goodfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.R
import com.indah.goodfood.model.ModelMakanan

class AdapterMakanan(
    val itemMakanan : List<ModelMakanan>
): RecyclerView.Adapter<AdapterMakanan.MyViewHolder>() {
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgMakanan : ImageView = itemView.findViewById(R.id.imgMakanan)
        var txtMakanan : TextView = itemView.findViewById(R.id.txtNama)
        var txtHarga : TextView = itemView.findViewById(R.id.txtHarga   )

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_beranda_makanan,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMakanan.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMakanan[position]
        holder.imgMakanan.setImageResource(currentItem.imgMakanan)
        holder.txtMakanan.text = currentItem.namaMakanan
        holder.txtHarga.text = currentItem.hargaMakanan

    }
}