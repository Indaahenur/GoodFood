package com.indah.goodfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.R
import com.indah.goodfood.model.ModelMinuman
import com.indah.goodfood.model.ModelPesanan

class AdapterPesanan(
    val itemPesanan : List<ModelPesanan>
): RecyclerView.Adapter<AdapterPesanan.MyViewHolder>() {
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgPesanan : ImageView = itemView.findViewById(R.id.imgPesanan)
        var txtNamaPesanan : TextView = itemView.findViewById(R.id.txtNamaPesanan)
        var txtHargaPesanan : TextView = itemView.findViewById(R.id.txtHargaPesanan)
        var txtAlamat : TextView = itemView.findViewById(R.id.txtAlamatPesanan)
        var txtTanggal : TextView = itemView.findViewById(R.id.txttanggalPesanan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pesanan,parent,false)
        return AdapterPesanan.MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemPesanan.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemPesanan[position]
        holder.imgPesanan.setImageResource(currentItem.imgPesanan)
        holder.txtNamaPesanan.text = currentItem.namaPesanan
        holder.txtHargaPesanan.text = currentItem.hargaPesanan
        holder.txtAlamat.text = currentItem.alamatPesanan
        holder.txtTanggal.text = currentItem.tanggaPesanan
    }
}