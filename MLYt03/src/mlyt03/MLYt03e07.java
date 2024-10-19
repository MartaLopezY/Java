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
 * Indicar la funcionalidad del programa y reducir el contenido de for para que sea más rápido
 import java.util.Scanner;
public class Ejercicios {
public static void main(String[] args) {
int num;
Scanner teclado = new Scanner(System.in);
System.out.print("Introduce un número natural entre 1 y 1000: ");
num = teclado.nextInt();
if (num <0 && num > 1000)
System.out.println("Numero incorrecto.");
else
for (int i=num;num>=1;i--)
if (num % i == 0) System.out.println(i);
} }
 */
public class MLYt03e07 {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num < 0 && num > 1000) {
            System.out.println("Numero incorrecto.");
        } else {
            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
/*El programa me muestra los divisores de un número introducido. 
En el programa original, la condición del bucle no la varío dentro del bucle y por lo tanto me lo hace de manera infinita*/