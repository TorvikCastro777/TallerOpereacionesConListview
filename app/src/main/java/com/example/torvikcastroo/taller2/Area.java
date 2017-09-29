package com.example.torvikcastroo.taller2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Area extends Activity {

    private ListView lv;
    private Resources resources;
    private String opca[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        lv = (ListView) findViewById(R.id.Area);
        resources = this.getResources();
        opca = resources.getStringArray(R.array.OpcionesArea);
        ArrayAdapter<String> adaptera = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opca);
        lv.setAdapter(adaptera);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        in = new Intent(Area.this, Cuadrado.class);
                        startActivity(in);
                        break;
                     case 1:
                         in = new Intent(Area.this, Rectangulo.class);
                         startActivity(in);
                         break;
                    case 2:
                        in = new Intent(Area.this, Triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Area.this, Circulo.class);
                        startActivity(in);
                        break;
                }
            }
        }
        );}

    }
