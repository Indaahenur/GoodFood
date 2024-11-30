package com.indah.goodfood.model

import com.indah.goodfood.R

data class ModelPesanan (
    val imgPesanan : Int,
    val namaPesanan : String,
    val hargaPesanan : String,
    val alamatPesanan : String,
    val tanggaPesanan : String,

)

object ListPesanan{
    fun getMode() : List<ModelPesanan>{
        val item1 = ModelPesanan(
            R.drawable.geprek,
            "Ayam Geprek",
            "Rp. 9.000",
            "jl. Mangga no 2",
            "1 November 2024"
        )

        val item2 = ModelPesanan(
            R.drawable.taichan,
            "Sate Taichan",
            "Rp. 10.000",
            "jl. Mangga no 4",
            "1 November 2024"
        )

        val item3 = ModelPesanan(
            R.drawable.nasi_ayam_bakar,
            "Ayam Bakar",
            "Rp. 12.000",
            "jl. Mangga no 5",
            "4 November 2024"
        )

        val itemList : ArrayList<ModelPesanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)


        return itemList
    }
}