/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que resuelve un sistema de ecuaciones
 */
public class MLYt02e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, e, f, denominador;
        float x, y;

        System.out.println("Introduzca el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el valor de b: ");
        b = teclado.nextInt();
        System.out.println("Introduzca el valor de c: ");
        c = teclado.nextInt();
        System.out.println("Introduzca el valor de d: ");
        d = teclado.nextInt();
        System.out.println("Introduzca el valor de e: ");
        e = teclado.nextInt();
        System.out.println("Introduzca el valor de f: ");
        f = teclado.nextInt();
        denominador = (a * e) - (b * d);
        if (denominador == 0) {
            System.out.println("El resultado de x y de y da error");
        } else {
            x = (float) ((c * e) - (b * f)) / denominador;
            y = (float) ((a * f) - (c * d)) / denominador;
            System.out.println("El valor de x es: " + x);
            System.out.println("El valor de y es: " + y);
        }

    }
}
