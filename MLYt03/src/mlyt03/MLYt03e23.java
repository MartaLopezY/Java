/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 3/10/2022 
 * Programa que permite introducir números y nos muestra el resultado de sumarlos, hasta
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el
programa finalizará después de introducidos 15 números.
 */
public class MLYt03e23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, i = 0, suma = 0;

        while (i < 15) {
            System.out.println("Introduzca un numero: ");
            num = teclado.nextInt();
            if (num > 1000) {
                break;
            }
            suma = suma + num;
            System.out.println("La suma acumulada es: "+suma);
            i++;
        }

    }

}
