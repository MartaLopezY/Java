/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos un año y me indica si es bisiesto
 */
public class MLYt02e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int año;

        System.out.println("Introduzca un año: ");
        año = teclado.nextInt();

        if (año % 4 == 0 && año % 100 != 0) {

            System.out.println("Es año bisiesto");
        } else {
            if (año % 400 == 0) {

                System.out.println("Es año bisiesto");
            } else {

                System.out.println("No es año bisiesto");
            }
        }

    }
}
