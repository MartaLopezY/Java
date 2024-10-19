/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt16;

/**
 * 15/3/2023
 *
 * @author marta.lopezyanez
 */
public class Jugador {

    public int id;
    public int fila;
    public int columna;

    Jugador(int i) {
        id = i;

    }

    void posicion(int f, int c) {
        fila = f;
        columna = c;
    }
}
