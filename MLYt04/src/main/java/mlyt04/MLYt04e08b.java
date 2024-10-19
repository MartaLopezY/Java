/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 21/10/2022
 *
 * @author marta.lopezyanez
 *
 * Programa que solicita una cadena, un número que indica una posición de la
 * cadena y una letra. El programa reemplazará sobre la misma cadena, el
 * carácter que hubiera en la posición indicada por la letra introducida. Hacer
 * dos versiones, la primera con String y otra con StringBuilder.
 */
public class MLYt04e08b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        StringBuilder nueva = new StringBuilder(cadena);
        System.out.println("Introduce un número: ");
        String num = teclado.nextLine();
        int pos = Integer.parseInt(num);
        System.out.println("Introduce una letra: ");
        char letra = teclado.nextLine().charAt(0);
        nueva.setCharAt(pos, letra);
        System.out.println("El texto modificado es: " + nueva);

    }

}
