/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa para pasar una nota numérica a nota por texto con if
 */
public class MLYt02e13a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.println("Introduzca la nota: ");
        nota = teclado.nextInt();

        if (nota < -1 || nota > 10) {
            System.out.println("La nota introducida es incorrecta");

        } else {
            if (nota <= 2) {
                System.out.println("La nota es muy deficiente");
            }
            if (nota > 2 && nota <= 4) {
                System.out.println("La nota es insuficiente");
            }
            if (nota > 4 && nota <= 6) {
                System.out.println("La nota es aprobado");
            }
            if (nota > 6 && nota <= 8) {
                System.out.println("La nota es notable");
            }
            if (nota > 8 && nota <= 10) {
                System.out.println("La nota es sobresaliente");
            }
        }
    }
}
