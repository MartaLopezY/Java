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
public class MLYt01e03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2, suma, resta;
        float division;

        System.out.println("Introduce un numero: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce otro numero: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        System.out.println("El resultado de la suma es: "+ suma);
        resta = num1 - num2;
        System.out.println("El resultado de la resta es: "+ resta);
        division = (float) num1 / num2;
        System.out.println("El resultado de la división es: "+ division);
    }
}
