package com.example.torvikcastroo.taller2;

import java.util.ArrayList;

/**
 * Created by Torvik Castro O on 25/09/2017.
 */

public class Datos {

    private static ArrayList<Operaciones> operaciones = new ArrayList<>();

    public static void calcular(Operaciones p){
        operaciones.add(p);
    }
    public static ArrayList<Operaciones> obtener(){
        return operaciones;
    }

}
