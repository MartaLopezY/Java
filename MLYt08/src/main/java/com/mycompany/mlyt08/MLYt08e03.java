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
 * de las mismas (añade sufijo _v3) y realiza los siguientes cambios: • Añade un
 * constructor a la clase Triangulo al que se le pasan tres parámetros: estilo,
 * alto y ancho. • Se invocará al constructor por defecto de la clase base. •
 * Modificar el programa de los ejercicios anteriores para que los triángulos
 * sean creados mediante este nuevo constructor.
 */
public class MLYt08e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());

        Triangulo_v3 triangulo = new Triangulo_v3(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        System.out.println("El area es: "+triangulo.area());
    }
}
