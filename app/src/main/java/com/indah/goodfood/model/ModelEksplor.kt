package com.indah.goodfood.model

import com.indah.goodfood.R

data class ModelEksplor(
    val imgMakananEks : Int,
    val namaMakananEks : String,
    val hargaMakananEks : String
)
object ListMakananEksplor{
    fun getMode() : List<ModelEksplor>{
        val item1 = ModelEksplor(
            R.drawable.taichan,
            "Sate Taichan",
            "Rp. 15.000",
        )

        val item2 = ModelEksplor(
            R.drawable.lontong,
            "Lontong Sayur",
            "Rp. 12.000",
        )

        val item3 = ModelEksplor(
            R.drawable.sate,
            "Sate",
            "Rp. 10.000",
        )

        val item4 = ModelEksplor(
            R.drawable.nasi_ayam_bakar,
            "Ayam Geprek",
            "Rp. 10.000",
        )

        val itemList : ArrayList<ModelEksplor> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)


        return itemList
    }
}