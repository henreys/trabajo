package com.example.herneys.taller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    //Declaración de variables
    private TextView nombre,segundoNombre,primerApellido,segundoApellido,edad,sexo;
    private Bundle b;
    private Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



        nombre = (TextView)findViewById(R.id.txtNombre);
        segundoNombre = (TextView)findViewById(R.id.txtSegundoNombre);
        primerApellido = (TextView)findViewById(R.id.txtPrimerApellido);
        segundoApellido = (TextView)findViewById(R.id.txtSegundoApellido);
        edad = (TextView) findViewById(R.id.txtEdad);
        sexo = (TextView) findViewById(R.id.txtSexo);
        i = new Intent(this,Mensaje.class);
        b = new Bundle();

    }

    public void MensajeN(View v)
    {

        String nomb ="",segundoNom="",primerApe ="",segundoApe="",eda="",sex="";

        b.putString("Nombre",nomb);
        b.putString("Segundo Nombre", segundoNom);
        b.putString("Primer Apellido",primerApe);
        b.putString("Segundo Apellido",segundoApe);
        b.putString("Edad",eda);
        b.putString("Sexo",sex);

        i.putExtras(b);
        startActivity(i);

    }

    public  void BorarTxt()
    {


    }
}
