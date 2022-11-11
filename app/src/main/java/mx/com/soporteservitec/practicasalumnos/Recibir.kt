package mx.com.soporteservitec.practicasalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Recibir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibir)
        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val direccion = bundle?.getString("direccion")
        val telefono = bundle?.getString("telefono")
        val correo = bundle?.getString("correo")
        val fechan = bundle?.getString("fechan")
        val sexo = bundle?.getString("sexo")

        val datos=findViewById<TextView>(R.id.txtmostrar)
        datos.setText("Nombre: ${nombre} \n Dirección: ${direccion} \n Telefono: ${telefono} \n Correo: ${correo} \n Fecha de Nacimiento: ${fechan} \n Sexo: ${sexo}")
    }
}