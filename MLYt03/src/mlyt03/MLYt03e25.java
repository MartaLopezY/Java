/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 3/10/2022 Programa que muestra por pantalla
 * alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un
 * número entero positivo tecleado previamente
 */
public class MLYt03e25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Hola");
            i++;
            if (i == num) {
                break;
            } else {
                System.out.println("Adios");
            }

        }

    }

}
