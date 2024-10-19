/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt05;

import java.util.Scanner;


/* 26/10/2022
 *
 * @author marta.lopezyanez
Programa que calcule el factorial de números menores de 20. El programa permite al usuario
meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20.
 */
public class MLYt05e05 {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        while (num >= 1 && num <= 20) {
            System.out.println("Introduce un número entre 1 y 20:");
            num = teclado.nextInt();
            System.out.println("El factorial del número introducido es: " + factorial(num));
        }
    }
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <=num; i++) {
            fact = fact * i;

        }
        return fact;
    }

}
