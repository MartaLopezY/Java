/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;

/**
 *
 *
 * @author marta.lopezyanez
 */
public class PoligonoIrregular implements Perimetrable {

    public static ArrayList<Float> lados = new ArrayList<>();

    PoligonoIrregular(ArrayList<Float> lad) {
        lados = lad;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (float lad : lados) {
            perimetro += lad;
        }

        return perimetro;

    }

}
