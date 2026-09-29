package com.example.appteca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        val appId = intent.getIntExtra("appId", -1)
        val app = Catalogo.apps.find { it.id == appId }
        if (app == null) { finish(); return } // el plan B: sin dato válido, esta pantalla no tiene sentido
        findViewById<TextView>(R.id.tvDetNombre).text = app.nombre
        findViewById<TextView>(R.id.tvDetCategoria).text = app.categoria
        findViewById<TextView>(R.id.tvDetDescripcion).text = app.descripcion
    }
}