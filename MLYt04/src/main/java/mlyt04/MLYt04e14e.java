/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 21/10/2022
 *
 * @author marta.lopezyanez
 *
 * Programa al que se le introduzca una cadena por teclado, que la convierta a
 * StringBuilder, y aplicando métodos de esa clase, haga lo siguiente: Darles la
 * vuelta a todos los caracteres del StringBuilder.
 */
public class MLYt04e14e {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        StringBuilder nueva = new StringBuilder(cadena);
        nueva.reverse();
        System.out.println("El texto modificado es: " + nueva);

    }

}
