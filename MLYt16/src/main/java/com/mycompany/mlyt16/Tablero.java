/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt16;

import java.util.Random;

/**
 * 15/3/2023
 *
 * @author marta.lopezyanez
 */
public class Tablero {

    private static Tablero instance = null;
    public int[][] casillas = new int[20][20];

    private Tablero() {
    }

    public static Tablero getInstance() {
        if (instance == null) {
            instance = new Tablero();
        }
        return instance;
    }

    public void casilla(int id) {
        Random r = new Random();
        int i;
        int j;
        do {
            i = r.nextInt(20);
            j = r.nextInt(20);
        } while (casillas[i][j] != 0);
        casillas[i][j] = id;
    }

    public int fila(int id) {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (id == casillas[i][j]) {
                    return i;
                }
            }
        }
        return 0;
    }

    public int columna(int id) {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (id == casillas[i][j]) {
                    return j;
                }
            }
        }
        return 0;
    }

}
