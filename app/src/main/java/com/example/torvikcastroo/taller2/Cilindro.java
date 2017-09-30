package com.example.torvikcastroo.taller2;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class Cilindro extends Activity {

    private TextView resultado;
    private EditText dato1, dato2;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cilindro);
        dato1 = (EditText)findViewById(R.id.txt1);
        dato2 = (EditText)findViewById(R.id.txt2);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcularCilindro(View view){
        String opera,dt1,dt2,res,dat;
        double rad,altura, result;
        if (validar()){
            opera = "Volumen del cilindro";
            rad = Double.parseDouble(dato1.getText().toString());
            altura = Double.parseDouble(dato2.getText().toString());
            dt1 = "Valor del radio: " + rad;
            dt2 = "Valor de la altura: " + altura;
            dat = dt1 +"\n"+dt2;
            result = (Math.PI*(Math.pow(rad,2)*altura));
            res = Integer.toString((int) result);
            resultado.setText("El Volumen del Cilindro Es: " + String.format( "%.1f", result ));
            Operaciones p = new Operaciones(opera,dat,res);
            p.calcular();
            Toast.makeText(this,resources.getString(R.string.mensajeexitoso),Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validar(){
        if(dato1.getText().toString().isEmpty()){
            dato1.setError(this.getResources().getString(R.string.error));
            dato1.requestFocus();
            return false;
        }
        if(Double.parseDouble( dato1.getText().toString())==0){
            dato1.requestFocus();
            dato1.setError(this.getResources().getString(R.string.error1));
            return false;
        }

        if(dato2.getText().toString().isEmpty()){
            dato2.setError(this.getResources().getString(R.string.error));
            dato2.requestFocus();
            return false;
        }
        if(Double.parseDouble( dato2.getText().toString())==0) {
            dato2.requestFocus();
            dato2.setError(this.getResources().getString(R.string.error1));
            return false;
        }
        return true;
    }

    public void borrar2(View v){
        resultado.setText("");
        dato1.setText("");
        dato2.setText("");
        dato1.requestFocus();
    }

}