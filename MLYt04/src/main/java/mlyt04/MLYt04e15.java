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
 * Programa en el que el usuario introduzca un texto y sustituya sus posiciones
 * impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares
 * pasaría a: “a*c*e*g”
 */
public class MLYt04e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int longitud = cadena.length();
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            char nueva;
            if (i % 2 == 0) {
                nueva = cadena.charAt(i);

            } else {
                nueva = '*';
            }

            resultado = resultado + nueva;
        }

        System.out.println("El texto modificado es: " + resultado);

    }

}
