package com.example.parques

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGuardar = findViewById<Button>(R.id.boton)
        buttonGuardar.setOnClickListener{
            val nombre = findViewById<EditText>(R.id.nombre).text.toString()

            val descripcion = findViewById<EditText>(R.id.descripcion).text.toString()

            val telefono = findViewById<EditText>(R.id.telefono).text.toString()

            val web = findViewById<EditText>(R.id.web).text.toString()

            val horaApertura = findViewById<Spinner>(R.id.spinner1).selectedItem.toString()

            val horaCierre = findViewById<Spinner>(R.id.spinner2).selectedItem.toString()

            val deportes = findViewById<RadioButton>(R.id.cDeportes).isChecked

            val parqueInfantil = findViewById<RadioButton>(R.id.cPInfantil).isChecked

            val restaurante = findViewById<RadioButton>(R.id.cRestaurante).isChecked

            val zonaMascotas = findViewById<RadioButton>(R.id.cZMascotas).isChecked

            Log.d("MainActivity", "Nombre: " +nombre)
            Log.d("MainActivity", "Descripción: " + descripcion)
            Log.d("MainActivity", "Teléfono: " + telefono)
            Log.d("MainActivity", "Sitio web: " + web)
            Log.d("MainActivity", "Hora de apertura: " + horaApertura)
            Log.d("MainActivity", "Hora de cierre: " + horaCierre)
            Log.d("MainActivity", "Deportes: " + deportes)
            Log.d("MainActivity", "Parque infantil: " + parqueInfantil)
            Log.d("MainActivity", "Restaurante: " + restaurante)
            Log.d("MainActivity", "Zona de mascotas: "+ zonaMascotas)

        }

    }
}