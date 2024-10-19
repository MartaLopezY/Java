/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt08;

import java.util.Scanner;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez. C
 */
public class MLYt08e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        Triangulo_v7 triangulo1 = new Triangulo_v7(b, h, est);
        System.out.println("El área del primer triangulo es: " + triangulo1.area());
        Triangulo_v7 triangulo2 = new Triangulo_v7(triangulo1);
        System.out.println("El área del triangulo copiado es: " + triangulo2.area());

    }
}
