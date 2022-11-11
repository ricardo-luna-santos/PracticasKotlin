package mx.com.soporteservitec.practicasalumnos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = findViewById<EditText>(R.id.txtusuario)
        val pass = findViewById<EditText>(R.id.txtcontrasena)
        val entrar=findViewById<Button>(R.id.btnentrar)
        var cont=0;
        var res=0;
        entrar.setOnClickListener {
            if (user.text.toString()=="" || pass.text.toString()=="") {
                Toast.makeText(this,"Error Usuario o contraseña en blanco",Toast.LENGTH_LONG).show()

                }else{
                    if(user.text.toString()=="admin" && pass.text.toString()=="1234"){
                        Toast.makeText(this,"Bienvenido al sistema",Toast.LENGTH_LONG).show()
                        val intento1 = Intent(this, Menu::class.java)
                        startActivity(intento1)
                    }else{
                        cont++
                        res=3-cont
                        Toast.makeText(this,"Error de acceso te quedan "+res+" intentos",Toast.LENGTH_LONG).show()
                        if(cont==4){
                            Toast.makeText(this,"Limite de intentos",Toast.LENGTH_LONG).show()
                            user.isEnabled=false
                            pass.isEnabled=false
                            finish();
                        }
                    }
            }
        }
    }
}