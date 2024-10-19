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
 * teclado y dice si la primera posición de la cadena es igual a la última.
 */
public class MLYt04e01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int longitud = cadena.length();
        char letraini = cadena.charAt(0);
        char letrafin = cadena.charAt(longitud - 1);
        if (Character.compare(letraini, letrafin) == 0) {
            System.out.println("En el texto introducido la primera letra y la última son iguales");
        } else {
            System.out.println("En el texto introducido la primera letra y la última no son iguales");
        }

    }

}
