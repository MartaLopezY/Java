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
public class AlfilAjedrez extends PiezaAjedrez {
     AlfilAjedrez() {
     fila=0;
     columna=0;
       
    }

    @Override
    public boolean mover(int f, int c) {

        if ((fila - f) == (columna - c)) {
            fila=f;
            columna=c;
            return true;
        }
        else return false;
    }
      @Override
    public String toString() {
        String linea = String.format("El alfil se encuentra en la fila %d y columna %d", fila,columna);
        return linea;
    }

}
