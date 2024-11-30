package com.indah.goodfood

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indah.goodfood.adapter.AdapterPesanan
import com.indah.goodfood.model.ListPesanan
import com.indah.goodfood.model.ModelPesanan

class ProfileActivity : AppCompatActivity() {

    private lateinit var rv_pesanan : RecyclerView
    private lateinit var btnhome : ImageView
    private lateinit var btnekplor : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        rv_pesanan = findViewById(R.id.rvRiwayat)
        btnhome = findViewById(R.id.btnprofilhome)
        btnekplor = findViewById(R.id.btnEkplor)

        btnhome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnekplor.setOnClickListener{
            val intent = Intent(this, EkplorActivity::class.java)
            startActivity(intent)
        }


        rv_pesanan.layoutManager = GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false)

        val adapter = AdapterPesanan(ListPesanan.getMode() as ArrayList<ModelPesanan>)

        rv_pesanan.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}