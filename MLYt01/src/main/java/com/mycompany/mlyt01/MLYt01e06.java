/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt01;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt01e06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float gan, imp, costIni, costFin;

        System.out.println("Introduce el coste inicial del automovil: ");
        costIni = teclado.nextFloat();
        gan =  (costIni * 0.1f);
        imp =  ((costIni+ gan) * 0.2f);
        costFin = costIni + gan + imp;

        System.out.println("El coste final del automovil: " + costFin);

    }
}
