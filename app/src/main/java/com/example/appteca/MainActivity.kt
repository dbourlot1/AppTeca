package com.example.appteca

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.content.Intent
class MainActivity : AppCompatActivity() {
    private lateinit var adapter: AppAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = AppAdapter(Catalogo.apps) { app ->
            val intent = Intent(this, DetalleActivity::class.java)
            intent.putExtra("appId", app.id)
            startActivity(intent)
        }
        val rv = findViewById<RecyclerView>(R.id.rvApps)
        rv.layoutManager = LinearLayoutManager(this) // "en columna, de arriba a abajo"
        rv.adapter = adapter
    }
}