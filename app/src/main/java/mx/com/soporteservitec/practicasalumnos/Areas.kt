package mx.com.soporteservitec.practicasalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Areas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areas)
        val val1=findViewById<EditText>(R.id.txtval1)
        val val2=findViewById<EditText>(R.id.txtval2)
        val imagen=findViewById<ImageView>(R.id.imguno)
        val cir=findViewById<RadioButton>(R.id.rcir)
        val cuad=findViewById<RadioButton>(R.id.rcuad)
        val tri=findViewById<RadioButton>(R.id.rtri)
        val rec=findViewById<RadioButton>(R.id.rrect)

        val resultado=findViewById<TextView>(R.id.lblresultado)

        val respuesta=findViewById<Button>(R.id.btnresolver)

        cir.setOnClickListener {
            imagen.setImageResource(R.drawable.circulo)
            val1.setVisibility(View.VISIBLE);
            val2.setVisibility(View.INVISIBLE);
        }
        cuad.setOnClickListener {
            imagen.setImageResource(R.drawable.cuadro)
            val1.setVisibility(View.VISIBLE);
            val2.setVisibility(View.INVISIBLE);
        }
        tri.setOnClickListener {
            imagen.setImageResource(R.drawable.triangulo)
            val1.setVisibility(View.VISIBLE);
            val2.setVisibility(View.VISIBLE);
        }
        rec.setOnClickListener {
            imagen.setImageResource(R.drawable.rectangulo)
            val1.setVisibility(View.VISIBLE);
            val2.setVisibility(View.VISIBLE);
        }
        respuesta.setOnClickListener {
            if(cir.isChecked){
                val pi=3.1416;
                resultado.setText("El resultado es: ${(val1.text.toString().toFloat()*pi)*2}")
            }
           if(cuad.isChecked){
                resultado.setText("El resultado es: ${val1.text.toString().toFloat()*val1.text.toString().toFloat()}")
            }
          if(tri.isChecked){
                resultado.setText("El resultado es: ${(val1.text.toString().toFloat()*val2.text.toString().toFloat())/2}")
            }
            if(rec.isChecked){
                resultado.setText("El resultado es: ${(val1.text.toString().toFloat()*val2.text.toString().toFloat())}")
            }
        }
    }
}