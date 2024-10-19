/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt16;

import java.util.ArrayList;

/**
 * 18/1/2023
 *
 * @author marta.lopezyanez
 * @param <T>
 */
public class ListaPequeña<T> {

    private final ArrayList<T> valores;
    private int tamañoMax;

    ListaPequeña(int n) {
        if (n > 0) {
            tamañoMax = n;
        }

        valores = new ArrayList<>();
    }

    void añadir(T param) {
        if (valores.size() < tamañoMax) {
            valores.add(param);
        } else {
            valores.add(tamañoMax - 1, param);
        }
    }

    void clear() {

        valores.clear();

    }

    ArrayList getValores() {

        return valores;

    }
}
