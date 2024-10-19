/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;

/**
 * 2/2/2023
 *
 * @author marta.lopezyanez. Diseña una clase abstracta llamada Figura3D_v1 con
 * método abstracto volumen (). Crea subclases: Esfera_v1 y PrismaRectangular_v1
 * que implementen el método de la superclase. Incorpora los atributos que creas
 * necesarios a las tres clases. Haz un programa que cree una instancia de cada
 * una de las 2 figuras y muestre cuál de ellas ocupa más.
 */
public class MLYt10e02 {

    public static void main(String[] args) {

        ArrayList<Figura3D_v1> figuras = new ArrayList<>();

        figuras.add(new Esfera_v1(3, "esfera"));
        figuras.add(new PrismaRectangular_v1(3, 4, 8, "prisma"));

        for (Figura3D_v1 fig : figuras) {
            fig.toString();
        }
        if (figuras.get(0).volumen() > figuras.get(1).volumen()) {
            System.out.println("La esfera ocupa más que el prisma");
        } else {
            System.out.println("El prisma ocupa más que la esfera");
    
        }
    }
}
