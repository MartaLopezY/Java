/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 23/1/2023
 *
 * @author marta.lopezyanez. Realiza un programa que contenga un ArrayList de
 * figuras2D de cualquiera de sus tipos e introduce valores “a mano”, por
 * ejemplo, un par de instancias de cada tipo. A continuación, el programa: •
 * Sumar el área de todas ellas. ¿Tienen implementado el método área () todas
 * ellas? • Contar cuantos triángulos (sean de color o no) y cuantos
 * rectángulos.
 */
public class MLYt09e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String n, e, c;
        double b, h, sumaArea = 0;
        int trian = 0, rect = 0, salir = 0;
        ArrayList<Figura2D_v8> figuras = new ArrayList<>();

        do {
            System.out.println("\n\n----Selecciona un tipo de figura----");
            System.out.println("1) Triángulo\n 2) Rectangulo\n 3)Triangulo Color ");

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

                    figuras.add(new Triangulo_v8(b, h, e, n));

                }
                case 2 -> {
                    figuras.add(new Rectangulo_v8(b, h, n));

                }
                case 3 -> {
                    System.out.println("Introduce el estilo: ");
                    e = teclado.nextLine();
                    System.out.println("Introduce el color: ");
                    c = teclado.nextLine();
                    figuras.add(new TrianColor_v8(b, h, e, c, n));

                }

                default ->
                    System.out.println("Opcion invalida");
            }

            salir++;
        } while (salir < 10);

        for (Figura2D_v8 fig : figuras) {

            if (fig instanceof TrianColor_v8 trianColor_v8 ) {
                sumaArea+= trianColor_v8.area();
                trian++;
            }
            if (fig instanceof Rectangulo_v8 rectangulo_v8) {
                sumaArea+= rectangulo_v8.area();
                rect++;
            }

        }
        System.out.println("La suma de todas las areas es: "+sumaArea);
        System.out.println("Hay "+trian +" triangulos");
        System.out.println("Hay "+rect+" rectangulos");

    }
}
