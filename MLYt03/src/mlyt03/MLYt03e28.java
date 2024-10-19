/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 5/10/2022
 * Programa que saca por pantalla la suma, la media y el producto de los números pares comprendidos entre
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que
el segundo
 *
 */
public class MLYt03e28 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m, n, mayor, menor,suma=0;
        System.out.println("Introduzca un número: ");
        m = teclado.nextInt();
        System.out.println("Introduzca otro número: ");
        n = teclado.nextInt();
        if (m < n) {
            menor = m;
            mayor = n;
        } else {
            menor = n;
            mayor = m;
        }
        for (int i = 1+ menor; i < mayor; i++) {
            
            if (i%2==0) suma=suma+i;
           
        }
 System.out.println("La suma de los números pares comprendidos entre los números introducidos es: "+suma);
    }

}
