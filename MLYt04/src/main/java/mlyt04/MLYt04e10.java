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
 * Programa que solicita la entrada de 10 cadenas de caracteres y construya una
 * cadena con el primer carácter de cada cadena. Finalmente mostrará dicha
 * cadena por pantalla.
 */
public class MLYt04e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resultado = "";

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un texto: ");
            String cadena = teclado.nextLine();
            char letra = cadena.charAt(0);

            resultado = resultado + letra;
        }
          System.out.println("El texto encriptado es: " + resultado); 
        }

    }
