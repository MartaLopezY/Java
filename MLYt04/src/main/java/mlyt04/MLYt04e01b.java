/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 *  17/10/2022
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y dice si en la cadena aparece el carácter ‘x’.
 */
public class MLYt04e01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int pos = cadena.indexOf('x');
        if (pos != -1) {
            System.out.println("En el texto introducido aparece ´x´");
        } else {
            System.out.println("En el texto introducido no aparece ´x´");
        }
    }
}