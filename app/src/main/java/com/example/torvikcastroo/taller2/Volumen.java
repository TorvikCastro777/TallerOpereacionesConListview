package com.example.torvikcastroo.taller2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Volumen extends AppCompatActivity{

    private ListView lv;
    private Resources resources;
    private String opcv[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen);
        lv = (ListView) findViewById(R.id.Volumen);
        resources = this.getResources();
        opcv = resources.getStringArray(R.array.OpcionesVolumen);
        ArrayAdapter<String> adapterv = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opcv);
        lv.setAdapter(adapterv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                                          switch (i) {
                                              case 0:
                                                  in = new Intent(Volumen.this, Esfera.class);
                                                  startActivity(in);
                                                  break;
                                              case 1:
                                                  in = new Intent(Volumen.this, Cilindro.class);
                                                  startActivity(in);
                                                  break;
                                              case 2:
                                                  in = new Intent(Volumen.this, Cono.class);
                                                  startActivity(in);
                                                  break;
                                              case 3:
                                                  in = new Intent(Volumen.this, Cubo.class);
                                                  startActivity(in);
                                                  break;
                                          }
                                      }
                                  }
        );}
}
