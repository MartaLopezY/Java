/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 28/9/2022
 * Programa que se le introduce un número y que garantice que es positivo
 *
 */
public class MLYt03e13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduzca un número: ");
            num = teclado.nextInt();
            if (num <= 0) {
                System.out.println("Error: El número no es positivo");
            }
        } while (num <= 0);

    }

}
