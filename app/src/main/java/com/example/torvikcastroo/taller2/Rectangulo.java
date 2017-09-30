package com.example.torvikcastroo.taller2;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangulo extends Activity {
    private TextView resultado;
    private EditText dato1, dato2;
    private String operaciones [];
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangulo);
        dato1 = (EditText)findViewById(R.id.txt1);
        dato2 = (EditText)findViewById(R.id.txt2);
        resultado = (TextView)findViewById(R.id.lblResultado);
        resources = getResources();
    }

    public void calcularRectangulo(View view){
        String opera,dt1,dt2,res,dat;
        double base,altura, result;
        if (validar()){
            opera = "Area del rectangulo";
            base = Double.parseDouble(dato1.getText().toString());
            altura = Double.parseDouble(dato2.getText().toString());
            dt1 = "Valor de la base: " + base;
            dt2 = "Valor de la altura: " + altura;
            dat = dt1 +"\n"+dt2;
            result = (base*altura);
            res = Integer.toString((int) result);
            resultado.setText("El area del Rectangulo es " + String.format( "%.1f", result ));
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
