package com.example.actividad10moviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ConstrainLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrain_layout)


        val nombre = findViewById<EditText>(R.id.nombreidC)
        val apellido = findViewById<EditText>(R.id.apellidoid)
        val edad = findViewById<EditText>(R.id.edadid)

        val boton_regis = findViewById<Button>(R.id.botonRegistro)

        val boton_cs = findViewById<Button>(R.id.botonCambiarLayout)

        boton_regis.setOnClickListener(){
            Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
        }

        boton_cs.setOnClickListener(){
            val cambio_actividad_ = Intent(this, MainActivity::class.java)
            startActivity(cambio_actividad_)
        }
    }
}