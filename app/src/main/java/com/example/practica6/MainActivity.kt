package com.example.practica6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enlazar el EditText y el boton
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        // Configurar la acción del botón
        button.setOnClickListener {
            // Obtener el texto del EditText
            val texto = editText.text.toString()

            // Mostrar el texto en un Toast
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }
    }
}
