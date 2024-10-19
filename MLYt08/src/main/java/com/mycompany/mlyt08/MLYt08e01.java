/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt08;

import java.util.Scanner;

/**
 * 12/1/2023
 *
 * @author marta.lopezyanez Realiza las siguientes operaciones: • Crea una clase
 * llamada Figura2D con atributos numéricos con decimales y públicos: ancho y
 * alto y un método verDim que muestre por consola el alto y el ancho en una
 * sola línea, con dos decimales. • Define una clase llamada Triángulo que es
 * hija de Figura2D y añádele una cadena llamada estilo (vale: isósceles,
 * rectángulo, equilátero, etc.), un método llamado área que devuelva la
 * superficie del triángulo y un último método llamado verEstilo que muestre por
 * consola el valor del atributo estilo. • Finalmente hacer un programa que cree
 * un triángulo, asigne valores a sus atributos y use los métodos para ver sus
 * dimensiones, estilo y área.
 */
public class MLYt08e01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        Triangulo triangulo = new Triangulo(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        System.out.println("El area es: "+triangulo.area());
    }
}
