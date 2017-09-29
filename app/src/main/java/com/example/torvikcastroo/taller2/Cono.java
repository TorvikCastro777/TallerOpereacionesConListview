package com.example.torvikcastroo.taller2;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static android.R.attr.button;

public class Cono extends Activity {
    private TextView resultado;
    private EditText dato1, dato2;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cono);
        dato1 = (EditText)findViewById(R.id.txt1);
        dato2 = (EditText)findViewById(R.id.txt2);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcularCono(View view){
        String op,dt1,dt2,rs;
        double rad,altura, resul;
        if (validar()){
            op = "Volumen del cono";
            rad = Double.parseDouble(dato1.getText().toString());
            altura = Double.parseDouble(dato2.getText().toString());
            dt1 = "Valor de la base: " + rad;
            dt2 = "Valor de la altura: " + altura;
            resul = (Math.PI*(Math.pow(rad,2)*altura)/3);
            //rs = Integer.toString(resul);
            //Operaciones p = new Operaciones(op,dt1,dt2,rs);
            //p.calcular();
            resultado.setText("El Volumen del Cono Es: " + String.format( "Value of a: %.2f", resul ));
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
