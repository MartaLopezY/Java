/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 5/10/2022 Programa al que se le introducen 30
 * números y si la suma de los mismos es par nos muestra los 3 primeros que
 * introducimos, y si es impar nos muestre los tres últimos que introducimos.
 * Hay que garantizar que cada uno de dichos números está comprendido entre 0 y
 * 1000.
 *
 */
public class MLYt03e31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma = 0, num1=0, num2=0, num3=0, num28=0, num29=0, num30=0;

        for (int i = 0; i < 30; i++) {

            do {
                System.out.println("Introduzca un número: ");
                num = teclado.nextInt();
            } while (num < 0 || num > 1000);
            suma = suma + num;
            switch (i) {
                case 0 ->
                    num1 = num;
                case 1 ->
                    num2 = num;
                case 2 ->
                    num3 = num;
                case 27 ->
                    num28 = num;
                case 28 ->
                    num29 = num;
                case 29 ->
                    num30 = num;

            }
        }
         System.out.println("La suma de los números introducidos es: "+suma);
        if (suma % 2 == 0) {
            System.out.println("Los tres primeros números introducidos son: " + num1 + ", " + num2 + ", " + num3);
        } else {
            System.out.println("Los tres últimos números introducidos son: " + num28 + ", " + num29 + ", " + num30);
        }

    }

}
