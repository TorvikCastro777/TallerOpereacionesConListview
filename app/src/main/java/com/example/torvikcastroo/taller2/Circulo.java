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

public class Circulo extends Activity {

    private TextView resultado;
    private EditText dato;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circulo);
        dato = (EditText)findViewById(R.id.txt1);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcularCirculo(View view){
        String dat,res,opera;
        double rad, result;
        if (validar()){
            opera="Area del Circulo";
            rad = Double.parseDouble(dato.getText().toString());
            dat = "Valor del radio: " + dato.getText().toString();
            result = (Math.PI*(Math.pow(rad,2)));
            res = Integer.toString((int) result);
            resultado.setText("El Area del Circulo Es: " + String.format( "%.1f", result ));
            Operaciones p = new Operaciones(opera,dat,res);
            p.calcular();
            Toast.makeText(this,resources.getString(R.string.mensajeexitoso),Toast.LENGTH_SHORT).show();
        }
    }
    public boolean validar(){
        if(dato.getText().toString().isEmpty()){
            dato.setError(this.getResources().getString(R.string.error));
            dato.requestFocus();
            return false;

        }
        if(Double.parseDouble( dato.getText().toString())==0){
            dato.requestFocus();
            dato.setError(this.getResources().getString(R.string.error1));
            return false;
        }

        return true;
    }

    public void borrar(View v){
        resultado.setText("");
        dato.setText("");
        dato.requestFocus();
    }
}
