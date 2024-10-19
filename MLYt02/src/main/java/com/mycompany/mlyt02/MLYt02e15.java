/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez Programa al que le introducimos 2 números enteros y
 * calcula el valor de r de tres maneras diferentes
 */
public class MLYt02e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, r;

        System.out.println("Introduzca el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el valor de b: ");
        b = teclado.nextInt();

        if (b != 0 && a / b == 0) {
            r = a / b;   /*En el primer caso si introduzco el valor 0 para b, el programa verifica que es 0 y ya no hace la división. El programa funciona correctamente */
            System.out.println(r);
        }
        if (a / b == 0 && b != 0) {
            r = a / b; /*En este caso si introduzco el valor 0 para b, me da error porque primero me hace la división por 0 sin verificar nada*/
            System.out.println(r);
        }
        if (b != 0 & a / b == 0) {
            r = a / b;  /*En este último caso si introduzco el valor 0 para b, me da error porque primero verifica que es cero pero sigue y hace la división por 0 dando error*/
            System.out.println(r);
        }
    }
}


