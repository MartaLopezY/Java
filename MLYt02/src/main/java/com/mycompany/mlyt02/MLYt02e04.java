/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa al que le introducimos dos coordenadas x e y del plano, me indica si forman un cuadrado o un rectángulo y calcula su área
 */
public class MLYt02e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float x1, y1, x2, y2, area;
        System.out.print("Introduce la coordenada x del primer número: ");
        x1 = teclado.nextFloat();
        System.out.print("Introduce la coordenada y del primer número: ");
        y1 = teclado.nextFloat();
        System.out.print("Introduce la coordenada x del segundo número: ");
        x2 = teclado.nextFloat();
        System.out.print("Introduce la coordenada y del segundo número: ");
        y2 = teclado.nextFloat();
        if (abs(x2 - x1) == abs(y2 - y1)) {
            System.out.println("El area formada es un cuadrado");
        } else {
            System.out.println("El area formada es un rectangulo");
        }

        area = abs((x2 - x1) * (y2 - y1));

        System.out.println("El area del formada es: " + area);

    }
}
