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
public class MLYt01e08 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float edad, a;
        System.out.println("Introduce la edad de la primera persona: ");
        edad = teclado.nextInt();
        a = edad;
        System.out.println("Introduce la edad de la segunda persona: ");
        edad = teclado.nextInt();
        a = +edad;
        System.out.println("Introduce la edad de la tercera persona: ");
        edad = teclado.nextInt();
        a = a + edad;
        System.out.println("Introduce la edad de la cuarta persona: ");
        edad = teclado.nextInt();
        a = a + edad;
        a = (a / 4f);

        System.out.println("La edad media es: " + a);

    }
}
