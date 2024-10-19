/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que se introduce una fecha y verifica que es una fecha correcta
 */
public class MLYt02e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, año;
        boolean bisiesto;

        System.out.println("Introduzca el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduzca el año: ");
        año = teclado.nextInt();
        if (año % 4 == 0 && año % 100 != 0) {

            bisiesto = true;
        } else {
            if (año % 400 == 0) {
                bisiesto = true;
            } else {
                bisiesto = false;
            }

        }

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || año < 0) {

            System.out.println("La fecha introducida es incorrecta");
        } else {

            if ((mes == 2 && dia > 28 && bisiesto == false) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)) {

                System.out.println("La fecha introducida es incorrecta");
            } else {
                if (mes == 2 && dia > 29 && bisiesto == true) {
                    System.out.println("La fecha introducida es incorrecta");
                } else {
                    System.out.println("La fecha introducida correcta");
                }
            }

        }
    }
}
