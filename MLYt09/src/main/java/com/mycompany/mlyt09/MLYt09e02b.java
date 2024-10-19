/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt09;

import java.util.Scanner;

/**
 * 20/1/2023
 *
 * @author marta.lopezyanez. Realiza un programa que permita al usuario
 * seleccionar un tipo de figura (Triangulo o Rectangulo), luego llame al
 * constructor adecuado solicitando al usuario los parámetros necesarios,
 * dependiendo del tipo de figura. • Después de crear la figura, mostrará las
 * dimensiones de la misma (sea cual sea su tipo). • Finalmente, y utilizando el
 * operador instanceof, mostrará unos datos adicionales dependiendo del tipo de
 * figura que sea: o Si es de tipo Triangulo, mostrará el área. o Si es de tipo
 * Rectangulo, mostrará si es de forma cuadrada o no. • Usar una única variable
 * para almacenar la figura, sea del tipo que sea.
 */
public class MLYt09e02b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String n, e;
        double b, h;

        Figura2D_v8 figura = new Figura2D_v8();
        do {
            System.out.println("\n\n----Selecciona un tipo de figura----");
            System.out.println("1) Triángulo\n 2) Rectangulo\n c3)  Salir");

            int opcion = teclado.nextInt();
            System.out.println("Introduce el nombre: ");
            n = teclado.nextLine();
            System.out.println("Introduce el ancho:");
            b = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el alto:");
            h = Double.parseDouble(teclado.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el estilo: ");
                    e = teclado.nextLine();
                    figura = new Triangulo_v8(b, h, e, n);

                }
                case 2 -> {
                    figura = new Rectangulo_v8(b, h, n);

                }
                case 3 ->
                    salir = true;
                default ->
                    System.out.println("Opcion invalida");
            }

        } while (salir == false);
        figura.verDim();
        if (figura instanceof Triangulo_v8 triangulo_v8) {
            System.out.println(triangulo_v8.area());
        }
        if (figura instanceof Rectangulo_v8 rectangulo_v8) {
            if (rectangulo_v8.esCuadrado()) {
                System.out.println("Es cuadrado");
            } else {
                System.out.println("No es cuadrado");
            }
        }

    }

}
