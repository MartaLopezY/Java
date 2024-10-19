/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que me indica si un alumno aprueba o no en función de tres notas introducidas
 */
public class MLYt02e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float examen, clase, practica;

        System.out.println("Introduzca la nota del examen: ");
        examen = teclado.nextFloat();
        System.out.println("Introduzca la valoración del trabajo de clase: ");
        clase = teclado.nextFloat();
        System.out.println("Introduzca la nota del trabajo práctico: ");
        practica = teclado.nextFloat();
        if (examen >= 5) {

            System.out.println("Esta aprobado");
        } else {
            if (examen >= 4 && clase >= 5 && practica >= 5) {

                System.out.println("Esta aprobado");
            } else {
                if (examen >= 4 && (clase >= 8 || practica >= 8)) {
                    System.out.println("Esta aprobado");
                } else {
                    System.out.println("Esta suspenso");
                }
            }
        }
    }
}
