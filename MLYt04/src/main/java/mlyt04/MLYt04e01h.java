/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 19/10/2022
 * @author marta.lopezyanez Programa al que se le introduce una cadena por
 * teclado y convierte la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
 */
public class MLYt04e01h {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int numero = Integer.parseInt(cadena);
 
       
            System.out.println(numero);
        
    }
}
