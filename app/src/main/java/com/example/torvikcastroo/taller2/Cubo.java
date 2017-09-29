package com.example.torvikcastroo.taller2;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static android.R.attr.button;

public class Cubo extends Activity {
    private TextView resultado;
    private EditText dato;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cubo);
        dato = (EditText)findViewById(R.id.txt1);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcularCubo(View view){
        String op,dt,rs;
        double rad, resul;
        if (validar()){
            op = "Volumen Del Cubo";
            rad = Double.parseDouble(dato.getText().toString());
            dt = "Valor de la arista: " + rad;
            resul = Math.pow(rad,3);
            //rs = Integer.toString(resul);
            //Operaciones p = new Operaciones(op, op,dt,rs);
            //p.calcular();
            resultado.setText("El Volumen del Cubo Es: " + String.format( "Value of a: %.2f", resul ));

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

