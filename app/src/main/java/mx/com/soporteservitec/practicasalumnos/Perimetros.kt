package mx.com.soporteservitec.practicasalumnos

import android.os.Bundle
import android.transition.Visibility
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Perimetros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetros)

        val l1=findViewById<EditText>(R.id.txt0)
        val l2=findViewById<EditText>(R.id.txt1)
        val l3=findViewById<EditText>(R.id.txt2)
        val l4=findViewById<EditText>(R.id.txt3)
        val l5=findViewById<EditText>(R.id.txt4)
        val l6=findViewById<EditText>(R.id.txt5)
        val op=findViewById<Spinner>(R.id.lados)
        val calcular=findViewById<Button>(R.id.btncalcular)
        val res=findViewById<TextView>(R.id.lblresultado)

        calcular.setOnClickListener {
            if (op.selectedItemPosition == 0) {
                res.setText(
                    "El perimetro es: ${
                        (l1.text.toString().toFloat() * 3.1416)
                    }")
            } else {
                res.setText(
                    "El perimetro es: ${
                        (l1.text.toString().toFloat() + l2.text.toString()
                            .toFloat() + l3.text.toString().toFloat() + l4.text.toString()
                            .toFloat() + l5.text.toString().toFloat() + l6.text.toString()
                            .toFloat())
                    }"
                )

            }
        }

        op.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    l6.setVisibility(View.INVISIBLE);
                    l1.setText("0");
                    l1.setText("0");
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }
                if(position==1){
                    l1.setText("0");
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    l6.setVisibility(View.INVISIBLE);
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }
                if(position==1){
                    l1.setText("0");
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    l6.setVisibility(View.INVISIBLE);
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }
                if(position==2){
                    l1.setText("0");
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    l6.setVisibility(View.INVISIBLE);
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }
                if(position==3){
                    l1.setText("0");
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.INVISIBLE);
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }
                if(position==4){
                    l1.setText("0");
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.VISIBLE);
                    l2.setText("0");
                    l3.setText("0");
                    l4.setText("0");
                    l5.setText("0");
                    l5.setText("0");
                    res.setText("El perimetro es:");
                }

            //    Toast.makeText(this@Perimetros,"El Elemento seleccionado es posición número: " + position + " El String es: " + op.getSelectedItem().toString(),Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(arg0: AdapterView<*>?) {}
        })
    }
}