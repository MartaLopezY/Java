/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 29/9/2022
 * Programa que muestra los números primos entre 2 y 1000
 *
 */
public class MLYt03e19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mayor,num;
        System.out.println("Introduzca un número: ");
        num = teclado.nextInt();
        mayor=num;
        do{
         System.out.println("Introduzca otro número: ");
            num = teclado.nextInt();
            if (num<mayor)      System.out.println("Los numeros no estan ordenados");
            else mayor=num;
        }while (mayor<=num);

    }

}
