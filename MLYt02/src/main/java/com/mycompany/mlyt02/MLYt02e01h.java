/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 *  Programa que lee dos números y dice si el primero es mayor que el segundo, si es menor o si son iguales
 */
public class MLYt02e01h {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca un numero: ");
        num2 = teclado.nextInt();
        if (num1 > num2) {

            System.out.println("El primer número es mayor");

        } else {
            if (num2 == num1) {
                System.out.println("Los dos números son iguales");
            } else {
                System.out.println("El segundo número es mayor que el primero");
            }

        }
    }
}
