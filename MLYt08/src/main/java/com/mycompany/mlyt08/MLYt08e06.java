/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt08;

import java.util.Scanner;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez. Copia las clases anteriores como una nueva versión
 * de las mismas (añade sufijo _v6) y realiza los siguientes cambios: • Crea una
 * nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo
 * atributo privado de tipo String llamado color. • Esta nueva clase tiene un
 * constructor de 4 parámetros (alto, ancho, estilo, color), además del getter y
 * setter de color. • Haz un nuevo programa que cree un triángulo de color y
 * llame a métodos definidos en sus clases base.
 */
public class MLYt08e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el color: ");
        String col = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        TrianColor_v6 triangulo = new TrianColor_v6(b, h, est, col);
        triangulo.verDim();
        triangulo.verEstilo();
        System.out.println("El area es: "+triangulo.area());

    }
}
