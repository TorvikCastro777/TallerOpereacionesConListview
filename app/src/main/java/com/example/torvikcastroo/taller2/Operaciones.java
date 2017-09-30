package com.example.torvikcastroo.taller2;



public class Operaciones {

    private String operacion, dato, resultado;

    public Operaciones (String operacion, String dato, String resultado){
        this.dato = dato;
        this.operacion = operacion;
        this.resultado = resultado;
    }

    public String getOperacion(){
        return operacion;
    }

    public void setOperacion(String operacion){
        this.operacion = operacion;
    }

    public String getDato(){
        return dato;
    }

    public void setDato(String dato){
        this.dato = dato;
    }

    public String getResultado(){
        return resultado;
    }

    public void setResultado(String resultado){
        this.resultado = resultado;
    }

    public void calcular(){
        Datos.calcular(this);
    }








}




