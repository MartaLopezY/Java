/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee dos números enteros y muestra si el primero es mayor que el segundo
 */
public class MLYt02e01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número es mayor");
        } else {
            if (num1 < num2) {
                System.out.println("El primer número no es mayor");
            } else {

                System.out.println("Son iguales");
            }
        }
    }
}
