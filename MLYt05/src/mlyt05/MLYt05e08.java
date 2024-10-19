/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 26/10/2022 Realizar un programa al que se le
 * introduzcan dos números enteros positivos y nos diga cuál de los dos tiene
 * más divisores (usar función previa).
 */
public class MLYt05e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int num1 = teclado.nextInt();
        System.out.println("Introduce otro número entero:");
        int num2 = teclado.nextInt();
        if (cantidadDivisores(num1) > cantidadDivisores(num2)) {
            System.out.println("El numero de divisores del primer número es mayor que el del segundo");
        } else if (cantidadDivisores(num1) < cantidadDivisores(num2))  {
            System.out.println("El numero de divisores del segundo número es mayor que el del primero");
        } else System.out.println("El numero de divisores de los dos numeros son iguales");
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
