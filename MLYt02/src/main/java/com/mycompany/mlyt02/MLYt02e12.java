/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que introducimos dos fechas y me indica cúal es mayor
 */
public class MLYt02e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia1, mes1, año1;
        int dia2, mes2, año2;

        System.out.println("Introduzca el dia de la primera fecha: ");
        dia1 = teclado.nextInt();
        System.out.println("Introduzca el mes de la primera fecha: ");
        mes1 = teclado.nextInt();
        System.out.println("Introduzca el año de la primera fecha: ");
        año1 = teclado.nextInt();
        System.out.println("Introduzca el dia de la segunda fecha: ");
        dia2 = teclado.nextInt();
        System.out.println("Introduzca el mes de la segunda fecha: ");
        mes2 = teclado.nextInt();
        System.out.println("Introduzca el año de la segunda fecha: ");
        año2 = teclado.nextInt();

        if (año2 > año1 || (año2==año1 && mes2>mes1) || (año2==año1 && mes2==mes1 && dia2>dia1)) {

            System.out.println("La segunda fecha es mayor");
        } else {
            System.out.println("La primera fecha es mayor");
        }
    }
}
