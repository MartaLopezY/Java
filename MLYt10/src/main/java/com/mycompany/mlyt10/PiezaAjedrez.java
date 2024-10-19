/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;


/**
 *
 *
 * @author marta.lopezyanez
 */
public abstract class PiezaAjedrez {

    protected static int fila;
    protected static int columna;
    

    public void setFila(int f) {
        fila = f;
    }

    public int getfila() {
        return fila;
    }
      public void setColumna(int c) {
        columna = c;
    }

    public int getColumna() {
        return columna;
    }

    public abstract boolean mover(int f,int c);
    @Override
     public abstract String toString();
    }

