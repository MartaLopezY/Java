/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee un número y dice si es múltiplo de 2, de 3 y/o de 10.
 */
public class MLYt02e01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();

        if (num % 3 == 0) {

            System.out.println("El número es multiplo de 3");
        }
        if (num % 2 == 0) {
            System.out.println("El número es multiplo de 2");
            if (num % 10 == 0) {
                System.out.println("El número es multiplo de 10");
            }
        }
        if (3 % num != 0 && num % 2 != 0 && num % 10 != 0) {
            System.out.println("El número no es multiplo de 2 ni de 3 ni de 10");
        }

    }
}
