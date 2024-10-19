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
 * teclado y dice si la cadena es igual a la cadena “hola”.
 */
public class MLYt04e01g {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena1 = "Hola";
        System.out.println("Introduce un texto: ");
        String cadena2 = teclado.nextLine();
        int compara = cadena1.compareToIgnoreCase(cadena2);
        if (compara == 0) {
            System.out.println("El texto introducido es `Hola´");
        } else {
            System.out.println("El texto introducido no es `Hola´");
        }

    }
}
