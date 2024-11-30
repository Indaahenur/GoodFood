package com.indah.goodfood.model

import android.view.Display.Mode
import com.indah.goodfood.R

data class ModelMakanan(
    val imgMakanan : Int,
    val namaMakanan : String,
    val hargaMakanan : String
)

object ListMakanan{
    fun getMode() : List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.geprek,
            "Ayam Geprek",
            "Rp. 15.000",
        )

        val item2 = ModelMakanan(
            R.drawable.nasi_ayam_bakar,
            "Ayam Bakar",
            "Rp. 12.000",
        )

        val item3 = ModelMakanan(
            R.drawable.sate,
            "Sate",
            "Rp. 10.000",
        )

        val itemList : ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)


        return itemList
    }
}
