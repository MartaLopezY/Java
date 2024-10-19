/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y muestra por pantalla el contenido de la cadena pasada a mayúsculas
 * y minúsculas
 *   17/10/2022
 */
public class MLYt04e01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        String mayusculas = cadena.toUpperCase();
        System.out.println(mayusculas);
        String minusculas = cadena.toLowerCase();
        System.out.println(minusculas);
    }
}
