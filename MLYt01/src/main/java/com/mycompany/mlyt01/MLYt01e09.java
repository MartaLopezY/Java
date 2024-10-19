/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt01;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt01e09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int var1, var2, aux;
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();
        aux = var1;
        var1 = var2;
        var2 = aux;

        System.out.println("Ahora var1 es: " + var1);
        System.out.println("Ahora var2 es: " + var2);

    }
}
