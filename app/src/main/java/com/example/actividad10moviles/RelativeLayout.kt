package com.example.actividad10moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class   RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val boton_enviar = findViewById<Button>(R.id.boton_enviarRL)
        val botoncs = findViewById<Button>(R.id.botoncsCl)
        val text_nombre = findViewById<EditText>(R.id.nombre_iRL)
        val text_apellido = findViewById<EditText>(R.id.apellido_idRL)
        val text_edad = findViewById<EditText>(R.id.edad_idRL)

        boton_enviar.setOnClickListener {

            val nombre = text_nombre.text.toString()
            val apellido = text_apellido.text.toString()
            val edad = text_edad.text.toString()

            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()
        }

        botoncs.setOnClickListener(){
            val cambio_actividad__ = Intent(this, ConstrainLayout::class.java)
            startActivity(cambio_actividad__)
        }


    }
}