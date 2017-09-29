package com.example.torvikcastroo.taller2;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends Activity {

    private TextView resultado;
    private EditText dato;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuadrado);
        dato = (EditText)findViewById(R.id.txt1);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcular(View view){
        String dat,res,opera;
        double lado, resul;
        if (validar()){
            opera="Area del Cuadrado";
            lado = Double.parseDouble(dato.getText().toString());
            dat = dato.getText().toString();
            resul = lado * lado;
            res = resultado.getText().toString();
            resultado.setText("El area del cuadrado es " + String.format( "Value of a: %.2f", resul ));

            Operaciones p = new Operaciones(dat,res,opera);
            p.calcular();
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
