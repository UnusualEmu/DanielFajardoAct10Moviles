package com.example.actividad10moviles


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton_enviar = findViewById<Button>(R.id.boton_enviar)
        val text_nombre = findViewById<EditText>(R.id.nombre_iRL)
        val text_apellido = findViewById<EditText>(R.id.apellido_id)
        val text_edad = findViewById<EditText>(R.id.edad_id)
        val boton_cambio_actividad = findViewById<Button>(R.id.botonCambioScena)

        boton_enviar.setOnClickListener {

            val nombre = text_nombre.text.toString()
            val apellido = text_apellido.text.toString()
            val edad = text_edad.text.toString()

            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()

        }

        // Cambio actividad a relative layout
        boton_cambio_actividad.setOnClickListener {
            val cambio_actividad = Intent(this, RelativeLayout::class.java)
            startActivity(cambio_actividad)
        }
    }
}