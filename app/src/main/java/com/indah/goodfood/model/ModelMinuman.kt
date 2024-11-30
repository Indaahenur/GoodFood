package com.indah.goodfood.model

import com.indah.goodfood.R

data class ModelMinuman(
    val imgMinuman : Int,
    val namaMinuman : String,
    val hargaMinuman : String
)

object ListMinuman{
    fun getMode() : List<ModelMinuman>{
        val item1 = ModelMinuman(
            R.drawable.lemontea,
            "Lemon Tea",
            "Rp. 9.000",
        )

        val item2 = ModelMinuman(
            R.drawable.esjeruk,
            "Es Jeruk",
            "Rp. 10.000",
        )

        val item3 = ModelMinuman(
            R.drawable.lemontea,
            "Lomon Tea",
            "Rp. 12.000",
        )

        val itemList : ArrayList<ModelMinuman> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)


        return itemList
    }
}
