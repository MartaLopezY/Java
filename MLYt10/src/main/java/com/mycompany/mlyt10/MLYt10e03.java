/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;

/**
 * 2/2/2023
 *
 * @author marta.lopezyanez. Haz una nueva versión de las clases del ejercicio
 * anterior (añádele el sufijo _v2). Añádele a la clase base el método abstracto
 * superficie (). Crea una nueva clase Cilindro y haz que implemente los métodos
 * de la superclase. Haz un programa que permita crear una instancia de cada una
 * de las 3 figuras y nos muestre cuál tiene más superficie.
 */
public class MLYt10e03 {

    public static void main(String[] args) {

        ArrayList<Figura3D_v2> figuras = new ArrayList<>();

        figuras.add(new Esfera_v2(3, "esfera"));
        figuras.add(new PrismaRectangular_v2(3, 4, 8, "prisma"));
        figuras.add(new Cilindro_v2(3, 8, "prisma"));
        for (Figura3D_v2 fig : figuras) {
            fig.toString();
        }
        if (figuras.get(0).superficie() > figuras.get(1).superficie() && figuras.get(0).superficie() > figuras.get(2).superficie()) {
            System.out.println("La esfera tiene más superficie");
        } else if (figuras.get(1).superficie() > figuras.get(2).superficie()) {
            System.out.println("El prisma tiene más superficie");

        } else {
            System.out.println("El cilindro tiene más superficie");
        }
    }
}
