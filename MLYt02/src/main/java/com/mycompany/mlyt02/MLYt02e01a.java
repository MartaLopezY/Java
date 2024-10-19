/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee un número entero y determina si es mayor de 10.
 */
public class MLYt02e01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
        if (num > 10) {
            System.out.println("El número es mayor de 10");
        } else {
            if (num == 10) {
                System.out.println("El número es 10");
            } else {
                System.out.println("El número es menor de 10");
            }
        }
    }
}
