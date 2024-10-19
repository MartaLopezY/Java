/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 26/10/2022 Realiza una función llamada
 * cantidadDivisores al que se le pase como parámetro un número entero y
 * devuelva el número de divisores o bien cero si el número es negativo. Usa
 * dicha función en un main
 */
public class MLYt05e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int num = teclado.nextInt();
        System.out.println("El numero de divisores del número introducido es: " + cantidadDivisores(num));
    }


public static int cantidadDivisores(int num) {
        int contador = 0;
        for (int i = num; i >1; i--) {
           if (num % i == 0) {
                   contador= contador+ 1;
                }  
        }
        return contador;
    }
}
