/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee dos números enteros y dice si uno y solo uno es mayor de 10
 */
public class MLYt02e01g {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca un numero: ");
        num2 = teclado.nextInt();
        if (num1 > 10 && num2 < 10) {

            System.out.println("Solo uno de los dos es mayor que 10");

        } else {
            if (num2 > 10 && num1 < 10) {
                System.out.println("Solo uno de los dos es mayor que 10");
            } else {
                System.out.println("No hay un único número mayor que 10");
            }

        }
    }
}
