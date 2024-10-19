/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 *  Programa que lee dos números enteros y dice si el segundo es divisor del primero
 */
public class MLYt02e01i {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca un numero: ");
        num2 = teclado.nextInt();

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println("El segundo número es divisor del primero");
        } else {
            if (num2 == 0) {
                System.out.println("Error: El segundo número es cero");
            } else {
                System.out.println("El segundo número no es divisor del primero");
            }
        }
    }
}
