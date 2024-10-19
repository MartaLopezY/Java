/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos una hora, verifica los valores y calcula los segundos totales hasta ese instante
 */
public class MLYt02e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora, minutos, segundos, segtotal;

        System.out.println("Introduzca la hora: ");
        hora = teclado.nextInt();
        System.out.println("Introduzca los minutos: ");
        minutos = teclado.nextInt();
        System.out.println("Introduzca los segundos: ");
        segundos = teclado.nextInt();
        if (hora < 0 || hora >= 24) {

            System.out.println("La hora introducida es incorrecta ");
        } else {
            if (minutos < 0 || minutos >= 60) {

                System.out.println("La hora introducida es incorrecta ");
            } else {
                if (segundos < 0 || segundos >= 60) {
                    System.out.println("La hora introducida es incorrecta ");
                } else {
                    segtotal = (hora * 3600) + (minutos * 60) + segundos;
                    System.out.println("Los segundos totales son: " + segtotal);
                }
            }
        }
    }

}
