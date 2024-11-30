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
import com.indah.goodfood.adapter.AdapterEksplor
import com.indah.goodfood.model.ListMakananEksplor
import com.indah.goodfood.model.ModelEksplor

class EkplorActivity : AppCompatActivity() {

    private lateinit var rv_eks : RecyclerView
    private lateinit var btnHome : ImageView
    private lateinit var btnprofil : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ekplor)

        rv_eks = findViewById(R.id.rvEksplor)
        btnHome = findViewById(R.id.imgHome)
        btnprofil = findViewById(R.id.btnprofilekplor)

        rv_eks.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)

        val adapter = AdapterEksplor(ListMakananEksplor.getMode() as ArrayList<ModelEksplor>)

        rv_eks.adapter = adapter

        btnHome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
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