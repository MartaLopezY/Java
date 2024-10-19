/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos una hora del dia y me dice qué dias de la semana hay bus
 */
public class MLYt02e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int  hora;

     
        System.out.println("Introduzca la hora: ");
        hora = teclado.nextInt();

        if ( hora < 0 || hora > 23) {

            System.out.println("La hora introducida es incorrecta ");
        } else {
            
                switch (hora){
                    case 9 -> System.out.println("Hay autobus los domingos");
                    case 10 -> System.out.println("Hay autobus todos los dias");
                    case 11 -> System.out.println("Hay autobus los domingos");
                    case 12 -> System.out.println("Hay autobus los jueves y los domingos");
                    case 13 -> System.out.println("Hay autobus los domingos");
                    case 14 -> System.out.println("Hay autobus todos los dias menos los sabados");
                    default -> System.out.println("No hay autobus ningún dia");
                }

            }
        

    }
}
