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
 * Programa que lee un número y me da su tabla de multiplicar si esta entre 1 y 10
 */
public class MLYt03e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, mult;
        System.out.println("Introduzca un numero: ");
        n = teclado.nextInt();
        if (n > 0 && n <= 10) {
            System.out.println("Su tabla de multiplicar de " + n + " es: ");
            for (int i = 1; i <= 10; i++) {
                mult = n * i;

                System.out.println(n + " x " + i + " = " + mult);

            }
        } else {
            System.out.println("El número introducido es incorrecto");
        }
    }
}
