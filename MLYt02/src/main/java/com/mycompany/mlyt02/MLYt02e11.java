/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que se introduce una fecha y me calcula el dia siguiente
 */
public class MLYt02e11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, año;
        boolean bisiesto, finmes;

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
        if (((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30)
                || ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 31)
                || ((bisiesto == true && dia == 29) || (bisiesto == false && dia == 28) && mes == 2)) {
            finmes = true;
        } else {
            finmes = false;
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
                    if (finmes == true && mes != 12) {
                        mes++;
                        dia = 1;
                    } else {
                        if (mes == 12 && finmes == true) {
                            mes = 1;
                            dia = 1;
                            año++;
                        } else {
                            dia++;
                        }

                    }

                }
                System.out.println("La fecha de mañana es: " + dia + "/" + mes + "/" + año);
            }
        }

    }
}
