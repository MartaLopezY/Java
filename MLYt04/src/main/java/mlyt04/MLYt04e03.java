/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 19/10/2022
 *
 * @author marta.lopezyanez Programa que solicita que se le introduzcan una
 * cadena y un carácter y nos muestra cuantas veces está contenido el carácter
 * en la cadena.
 */
public class MLYt04e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();

        System.out.println("Introduce una letra: ");
        char letra = teclado.nextLine().charAt(0);

        int longitud = cadena.length();
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            char aux = cadena.charAt(i);
            if ((Character.compare(letra, aux)) == 0) {
                contador++;
            }

        }

        System.out.println("La letra " + letra + " aparece " + contador + " veces");
    }

}
