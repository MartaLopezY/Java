/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos tres números enteros y en función de si son positivos o negativos realiza una operación u otra
 */
public class MLYt02e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, resultado;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        num3 = teclado.nextInt();
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            resultado=(num1+num2)*num3;
            System.out.println("El resultado es "+ resultado);
        } else {
            if (num1 < 0 && num2 < 0 && num3 < 0) {
                 resultado=num1*num2*num3;
            System.out.println("El resultado es "+ resultado);
            } else {
                resultado=num1+num2+num3;
            System.out.println("El resultado es "+ resultado);
            }
        }
    }
}
