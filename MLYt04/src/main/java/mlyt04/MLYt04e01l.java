/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 19/10/2022
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y dice cuántos dígitos numéricos hay en la cadena.
 */
public class MLYt04e01l {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int longitud = cadena.length();
        int digitos=0;
        
        for (int i = longitud-1 ; i >= 0; i--) {

         char letra=cadena.charAt(i);
          if ( Character.isDigit(letra) ) digitos++;

        }
    
            System.out.println("El número de digitos introducidos: "+digitos);
        
    }
}
