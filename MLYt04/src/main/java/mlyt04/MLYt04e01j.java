/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 17/10/2022
 *
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y si se encuentra con en su interior con “prueva” sustituye por
 * “prueba”.
 */
public class MLYt04e01j {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        cadena = cadena.replace("prueva", "prueba");
        System.out.println(cadena);
    }

}

