/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa para pasar una nota numérica a nota por texto con switch+case->
 */
public class MLYt02e13c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.println("Introduzca la nota: ");
        nota = teclado.nextInt();
        switch (nota) {

            case 0 -> System.out.println("La nota es muy deficiente");
            case 1 -> System.out.println("La nota es muy deficiente");
            case 2 -> System.out.println("La nota es muy deficiente");
            case 3 -> System.out.println("La nota es insuficiente");
            case 4 -> System.out.println("La nota es insuficiente");
            case 5 -> System.out.println("La nota es aprobado");
            case 6 -> System.out.println("La nota es es aprobado");
            case 7 -> System.out.println("La nota es notable");
            case 8 -> System.out.println("La nota es notable");
            case 9 -> System.out.println("La nota es sobresaliente");
            case 10 -> System.out.println("La nota es sobresaliente");
            default -> System.out.println("La nota introducida es incorrecta");

        }

    }
}
