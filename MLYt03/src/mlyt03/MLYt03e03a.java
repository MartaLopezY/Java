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
 * Programa que lee un número y me indica si es par o impar
 */
public class MLYt03e03a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Introduzca un numero: ");   /*Al meter el número antes del bucle me va a indicar de manera infinita si ese número es par o impar*/
        n = teclado.nextInt();
       while (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } 

    }
}
