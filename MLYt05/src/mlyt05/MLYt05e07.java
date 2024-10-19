/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 26/10/2022 Un número primo es aquel que solo tiene
 * como divisores el número 1 y a él mismo. Usando la función del programa
 * anterior, haz un programa que muestre la suma de los números primos
 * comprendidos entre 1 y 1000.
 */
public class MLYt05e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            if (cantidadDivisores(i) == 1) {
                suma = suma + i;
            }
        }
        System.out.println("La suma de los números primos entre 1 y 1000 es: " + suma);
    }

    public static int cantidadDivisores(int num) {
        int contador = 0;
        for (int i = num; i > 1; i--) {
            if (num % i == 0) {
                contador = contador + 1;
            }
        }
        return contador;
    }
}
