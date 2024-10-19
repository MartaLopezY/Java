/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Random;
import java.util.Scanner;

/**
 * 19/10/2022
 *
 * @author marta.lopezyanez Programa que muestra una contraseña generada
 * aleatoriamente teniendo las siguientes limitaciones: Tendrá entre 5 y 10
 * posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’
 */
public class MLYt04e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        String plantilla = "abcdefghij";
        String cadena = "";
        int longitud = r.nextInt(5) + 5;

        for (int i = 0; i < longitud; i++) {
            int pos = r.nextInt(8);
            int aux = 0;
            char letra = plantilla.charAt(pos);
            cadena = cadena + letra;
        }
        System.out.println("La contraseña generada es: " + cadena);
    }

}
