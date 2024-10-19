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
public class MLYt01e11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cat1, cat2;
        double cat1C, cat2C,hip;

        System.out.print("Introduce el valor del cateto 1: ");
        cat1 = teclado.nextInt();
        System.out.print("Introduce el valor del cateto 2: ");
        cat2 = teclado.nextInt();
        cat1C = Math.pow(cat1, 2);
        cat2C = Math.pow(cat2, 2);
        hip = Math.sqrt(cat1C + cat2C);
        System.out.println("El valor de la hipotenusa es: " + hip);

    }
}
