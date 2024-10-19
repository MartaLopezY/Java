/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 *  28/9/2022
 * Programa que suma una cantidad de números que se van introduciendo, siempre que sean positivos hasta que se teclee el -1.
 */
public class MLYt03e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma;
        suma = 0;

        do {
            System.out.println("Introduzca un numero positivo: ");
            num = teclado.nextInt();
            if (num > 0) {
                suma = suma + num;

                System.out.println("El valor acumulado es: " + suma);
            }

        } while (num != -1);
    }

}
