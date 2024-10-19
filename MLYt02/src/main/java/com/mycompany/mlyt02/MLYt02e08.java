/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos un dia y una hora, verifica que los datos son correctos y me dice si hay bus o no
 */
public class MLYt02e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, hora;

        System.out.println("Introduzca el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca la hora: ");
        hora = teclado.nextInt();

        if ((dia < 1 || dia > 7) || (hora < 9 || hora > 14)) {

            System.out.println("El dia o la hora introducida es incorrecta ");
        } else {
            if ((dia == 7 || hora == 10) || (dia == 4 && hora == 12) || (dia != 6 && hora == 14)) {
                System.out.println("Hay autobus");
            } else {
                System.out.println("No hay autobus");

            }
        }

    }
}
