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
public class MLYt01e05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float cels, fah, aguapul, aguacm;

        System.out.println("Introduce la temperatura en Celsius: ");
        cels = teclado.nextFloat();
        fah = Math.round((9 / 5f * cels + 32) * 100) / 100f;
        System.out.println("La temperatura" + cels + "ºC en grados Fahrenheit es: " + fah);
        System.out.println("Introduce la cantidad de agua en pulgadas: ");
        aguapul = teclado.nextFloat();
        aguacm = Math.round((aguapul * 2.55f) * 10) / 10f;
        System.out.println("La cantidad de agua del pluviometro son " + aguapul + "pulgadas y " + aguacm + "centimetros");

    }
}
