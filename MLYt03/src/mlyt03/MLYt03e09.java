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
 * Programa que suma una cantidad de números que se van introduciendo hasta que la suma acumulada llegue a 100
 */
public class MLYt03e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma;
        suma = 0;
        
        while (suma < 100) {
            System.out.println("Introduzca un numero: ");
            num = teclado.nextInt();
            suma = suma + num;
            if (suma > 100) {
                System.out.println("El valor acumulado excede de 100");
            } else {
                System.out.println("El valor acumulado es: " + suma);
            }

        }

    }

}
