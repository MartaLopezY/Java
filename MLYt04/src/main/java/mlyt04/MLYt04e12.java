/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 20/10/2022
 *
 * @author marta.lopezyanez
 *
 * Programa que solicita la entrada de una cadena de 6 posiciones, que todas
 * sean dígitos y sin repetidos. Si no cumple esas condiciones, el usuario
 * deberá introducirla de nuevo hasta que lo haga correctamente.
 */
public class MLYt04e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud = 10;
        boolean digito = false;

        do {
            System.out.println("Introduce un texto: ");
            String cadena = teclado.nextLine();
            longitud = cadena.length();
            
            if (longitud <= 6) {
                for (int i = 0; i < longitud; i++) {
                    char letra = cadena.charAt(i);
                    digito = Character.isDigit(letra);
                    if (digito==false) break;
                }
            }
        } while ((longitud > 6) || (digito == false));
     
    }

}
