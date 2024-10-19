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
 * teclado y dice si la cadena es un palíndromo (se lee igual hacia adelante
 * como hacia atrás)
 */
public class MLYt04e01m {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        boolean palindromo = true;
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            char letraini = cadena.charAt(i);
            char letrafin = cadena.charAt(longitud - 1 - i);
            if (Character.compare(letraini, letrafin) == 0) {
                palindromo = true;
            } else {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("El texto introducido es un palindromo");
        } else {
          System.out.println("El texto introducido no es un palindromo");  
        }
        
    }

}
