package mx.com.soporteservitec.practicasalumnos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)
        val nom=findViewById<EditText>(R.id.txtnombre)
        val dir=findViewById<EditText>(R.id.txtdireccion)
        val tel=findViewById<EditText>(R.id.txttelefono)
        val correo=findViewById<EditText>(R.id.txtcorreo)
        val fechan=findViewById<EditText>(R.id.txtfecha)
        val m=findViewById<RadioButton>(R.id.rmasculino)
        val f=findViewById<RadioButton>(R.id.rfemenino)
        val enviar=findViewById<Button>(R.id.btnenviar)
        var sexo=""
        enviar.setOnClickListener {
            if(m.isChecked){
                sexo="Masculino"
            }else if(f.isChecked){
                    sexo="Femenino"
            }else{
                sexo=""
            }
            val intento1 = Intent(this, Recibir::class.java)
            intento1.putExtra("nombre", nom.text.toString())
            intento1.putExtra("direccion", dir.text.toString())
            intento1.putExtra("telefono", tel.text.toString())
            intento1.putExtra("correo", correo.text.toString())
            intento1.putExtra("fechan", fechan.text.toString())
            intento1.putExtra("sexo", sexo)
            startActivity(intento1)
        }
    }
}