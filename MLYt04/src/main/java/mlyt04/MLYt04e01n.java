/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 19/10/2022
 *
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y crea una cadena que sea igual a la introducida, pero con la primera
 * y última posiciones intercambiadas.
 */
public class MLYt04e01n {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        String invertida = "";
        int longitud = cadena.length();
        for (int i = longitud-1 ; i >= 0; i--) {

            invertida = invertida + cadena.charAt(i);

        }
        System.out.println(cadena);
        System.out.println(invertida);
    }

}
