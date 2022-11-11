package mx.com.soporteservitec.practicasalumnos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val irdatos=findViewById<Button>(R.id.btnalmacenar)
        val opbasicas=findViewById<Button>(R.id.btnopbasicas)
        val opareas=findViewById<Button>(R.id.btnareas)
        val operimetros=findViewById<Button>(R.id.btnperimetros)
        val datos=findViewById<Button>(R.id.btndatos)
        val agenda=findViewById<Button>(R.id.btnagenda)

        val sal=findViewById<Button>(R.id.btnsalir)

        irdatos.setOnClickListener {
           val formguardar=Intent(this, Almacenar::class.java)
            startActivity(formguardar)
        }
        opbasicas.setOnClickListener {
            val formopbasicas=Intent(this, Operaciones::class.java)
            startActivity(formopbasicas)
        }
        opareas.setOnClickListener {
            val formopareas=Intent(this, Areas::class.java)
            startActivity(formopareas)
        }
        operimetros.setOnClickListener {
            val formperimetros=Intent(this, Perimetros::class.java)
            startActivity(formperimetros)
        }
        datos.setOnClickListener {
            val formdatos=Intent(this, Datos::class.java)
            startActivity(formdatos)
        }
        agenda.setOnClickListener {
            val formagenda=Intent(this,Agenda::class.java)
            startActivity(formagenda)
        }
        sal.setOnClickListener {
            finish()
        }
    }
}