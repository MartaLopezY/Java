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
 * Programa que lee un número entero y me muestra los 10 primeros numeros naturales
 */
public class MLYt03e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Introduzca un numero: ");
        n = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            n = n + 1;
            System.out.println(n);
        }

    }
}
