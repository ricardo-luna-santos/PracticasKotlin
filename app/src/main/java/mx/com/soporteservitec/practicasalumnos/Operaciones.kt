package mx.com.soporteservitec.practicasalumnos

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import java.lang.Double.parseDouble

class Operaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones)
        val val1=findViewById<EditText>(R.id.txtval1)
        val val2=findViewById<EditText>(R.id.txtval2)

        val sum=findViewById<RadioButton>(R.id.rsuma)
        val res=findViewById<RadioButton>(R.id.rresta)
        val mul=findViewById<RadioButton>(R.id.rmultiplicacion)
        val div=findViewById<RadioButton>(R.id.rdivision)

        val resultado=findViewById<TextView>(R.id.lblresultado)

        val respuesta=findViewById<Button>(R.id.btnresolver)

        /*sum.setOnClickListener {
            val1.setVisibility(View.VISIBLE);
            val2.setVisibility(View.VISIBLE);
        }*/
        respuesta.setOnClickListener {
            if(sum.isChecked){
                //Toast.makeText(this,"El valor de la suma es: ${val1.text.toString().toFloat()+val2.text.toString().toFloat()}",Toast.LENGTH_LONG).show()
                resultado.setText("El resultado es: ${val1.text.toString().toFloat()+val2.text.toString().toFloat()}")
            }
            if(res.isChecked){
                //Toast.makeText(this,"El valor de la suma es: ${val1.text.toString().toFloat()+val2.text.toString().toFloat()}",Toast.LENGTH_LONG).show()
                resultado.setText("El resultado es: ${val1.text.toString().toFloat()-val2.text.toString().toFloat()}")
            }
            if(mul.isChecked){
                //Toast.makeText(this,"El valor de la suma es: ${val1.text.toString().toFloat()+val2.text.toString().toFloat()}",Toast.LENGTH_LONG).show()
                resultado.setText("El resultado es: ${val1.text.toString().toFloat()*val2.text.toString().toFloat()}")
            }
            if(div.isChecked){
                //Toast.makeText(this,"El valor de la suma es: ${val1.text.toString().toFloat()+val2.text.toString().toFloat()}",Toast.LENGTH_LONG).show()
                resultado.setText("El resultado es: ${val1.text.toString().toFloat()/val2.text.toString().toFloat()}")
            }
        }


    }
}