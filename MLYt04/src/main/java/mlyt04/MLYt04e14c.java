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
 * StringBuilder, y aplicando métodos de esa clase, haga lo siguiente: Sustituir
 * el carácter de la posición 1 por una ‘z’.
 */
public class MLYt04e14c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       String cadena;
        do {
            System.out.println("Introduce un texto: ");
            cadena = teclado.nextLine();
        } while (cadena.length() <= 1);
        StringBuilder nueva = new StringBuilder(cadena);
        nueva.setCharAt(1, 'z');
        System.out.println("El texto modificado es: " + nueva);

    }

}
