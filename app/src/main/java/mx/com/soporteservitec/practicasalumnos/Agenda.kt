package mx.com.soporteservitec.practicasalumnos

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.io.*

class Agenda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
        val fecha=findViewById<EditText>(R.id.txtfecha)
        val hora=findViewById<EditText>(R.id.txthora)
        val guardar=findViewById<Button>(R.id.btnguardar)
        val buscar=findViewById<Button>(R.id.btnbuscar)
        val contenido=findViewById<EditText>(R.id.txtdatos)
        val archivos=findViewById<Spinner>(R.id.spinner)
        val salir=findViewById<Button>(R.id.btnsalir)

        guardar.setOnClickListener {
            val nomarchivo = fecha.text.toString().replace('/','-')+hora.text.toString()
            try {
                val archivo = OutputStreamWriter(openFileOutput(nomarchivo, Activity.MODE_PRIVATE))
                archivo.write(contenido.text.toString())
                archivo.flush()
                archivo.close()
            } catch (e: IOException) {
            }
            Toast.makeText(this, "Los datos fueron almacenados", Toast.LENGTH_SHORT).show()
            fecha.setText("")
            hora.setText("")
            contenido.setText("")
          /*  val lista = arrayOf("")
            val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
            archivos.adapter=adaptador1*/
            finish()
        }
        archivos.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               // Toast.makeText(this@Agenda,"El Elemento seleccionado es posición número: " + archivos.getSelectedItem().toString(),Toast.LENGTH_LONG).show()
                val archivo = InputStreamReader(openFileInput(archivos.getSelectedItem().toString()))
                val br = BufferedReader(archivo)
                var linea = br.readLine()
                val todo = StringBuilder()
                while (linea != null) {
                    todo.append(linea + "\n")
                    linea = br.readLine()
                }
                br.close()
                archivo.close()
                contenido.setText(todo)
            }

            override fun onNothingSelected(arg0: AdapterView<*>?) {}
        })
        salir.setOnClickListener {
            finish()
        }
        buscar.setOnClickListener {
            var files: Array<String> = this.fileList()
            if(fecha.text.toString()!=""){
                val filesfilter=files.filter { it.contains(fecha.text.toString().replace('/','-')+hora.text.toString()) }
                if(filesfilter.isEmpty()){
                    Toast.makeText(this, "No existen actividades registradas", Toast.LENGTH_LONG).show()
                }
                val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, filesfilter)
                archivos.adapter = adaptador1
            }else{
                Toast.makeText(this, "Coloca la fecha para buscar las notas", Toast.LENGTH_LONG).show()
            }

        }
    }
}