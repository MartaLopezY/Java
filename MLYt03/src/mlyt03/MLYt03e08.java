/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 *  28/9/2022
 * Programa que suma los 100 numeros siguientes a partir de uno introducido
 */
public class MLYt03e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma;
        suma = 0;
        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
        for (int i = num; i < num + 100; i++) {

            suma = suma + i;
        }
        System.out.println("El valor acumulado es: " + suma);
    }

}
