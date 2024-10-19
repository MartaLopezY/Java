/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 28/9/2022
 * Programa que lee dos valores enteros, m y n, y nos
 * muestra los números comprendidos entre ellos ordenados ascendentemente, junto
 * con el valor de elevar cada uno de esos números al cuadrado
 *
 */
public class MLYt03e11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m, n, mayor, menor, cuad;
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
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
            cuad = (int) Math.pow(i, 2);
            System.out.println(i + " El valor elevado al cuadrado es: " + cuad);

        }

    }

}
