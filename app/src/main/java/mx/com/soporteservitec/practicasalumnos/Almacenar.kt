package mx.com.soporteservitec.practicasalumnos

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Almacenar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenar)
        val nombre=findViewById<EditText>(R.id.txtnombre)
        val email=findViewById<EditText>(R.id.txtcorreo)
        val dato=findViewById<TextView>(R.id.txtdatos)
        val btnguardar=findViewById<Button>(R.id.btnguardar)
        val btncargar=findViewById<Button>(R.id.btnbuscar)
        var edad: Int=34
        var estatura: Float=1.6f
        var estatus: Boolean=true
        val preferencias = getSharedPreferences("datos1",Context.MODE_PRIVATE)

        btnguardar.setOnClickListener {
            val editor = preferencias.edit()
            editor.putString("name", nombre.text.toString())
            editor.putString("email",email.text.toString())
            editor.putString("edad",edad.toString())
            editor.putString("estatus",estatus.toString())
            editor.putString("altura",estatura.toString())
            editor.commit()
            Toast.makeText(this, "Datos registrados", Toast.LENGTH_LONG).show()
        }
        btncargar.setOnClickListener {
            val nombre = preferencias.getString("name", "No existe el dato")
            val email = preferencias.getString("email", "No existe el dato")
            val edad = preferencias.getString("edad", "No existe el dato")
            val altura = preferencias.getString("altura", "No existe el dato")
            val estatus = preferencias.getString("estatus", "No existe el dato")
            if (nombre != null) {
                if (nombre.length == 0) {
                    Toast.makeText(this, "No existe dicho nombre en la agenda", Toast.LENGTH_LONG).show()
                }else
                {
                    dato.setText("Nombre: "+nombre+"\n Correo: "+email+" \n Edad: "+edad+"\n Altura: "+altura+"\n Estatus: "+estatus)
                    Toast.makeText(this, "Datos encontrado"+nombre, Toast.LENGTH_LONG).show()
                }
                }else{
                Toast.makeText(this, "No existe el parametro", Toast.LENGTH_LONG).show()
            }
        }

    }
}