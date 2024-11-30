package com.indah.goodfood

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.adapter.AdapterMakanan
import com.indah.goodfood.adapter.AdapterMinuman
import com.indah.goodfood.model.ListMakanan
import com.indah.goodfood.model.ListMinuman
import com.indah.goodfood.model.ModelMakanan
import com.indah.goodfood.model.ModelMinuman

class MainActivity : AppCompatActivity() {

    private lateinit var rvMakanan : RecyclerView
    private lateinit var rvMinuman : RecyclerView
    private lateinit var btnEkplor : ImageView
    private lateinit var btnprofil : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rvMakanan = findViewById(R.id.rvmakanan)
        rvMinuman = findViewById(R.id.rvMinuman)
        btnEkplor = findViewById(R.id.btnEkplor5)
        btnprofil =findViewById(R.id.btnProfil)

        rvMakanan.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        rvMinuman.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)

        val adapter = AdapterMakanan(ListMakanan.getMode() as ArrayList<ModelMakanan>)
        val adapter2 = AdapterMinuman(ListMinuman.getMode() as ArrayList<ModelMinuman>)

        rvMakanan.adapter = adapter
        rvMinuman.adapter = adapter2

        btnEkplor.setOnClickListener{
            val intent = Intent(this,EkplorActivity::class.java)
            startActivity(intent)
        }

        btnprofil.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}