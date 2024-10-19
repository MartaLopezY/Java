/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 17/10/2022
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y nos dice si la cadena tiene más de 10 posiciones.
 */
public class MLYt04e01c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int longitud = cadena.length();
        if (longitud > 10) {
            System.out.println("El texto introducido tiene más de 10 posiciones");
        } else {
            System.out.println("El texto introducido no tiene más de 10 posiciones");
        }
    }
}
