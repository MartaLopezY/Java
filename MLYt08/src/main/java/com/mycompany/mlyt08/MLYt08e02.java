/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt08;

import java.util.Scanner;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez Copia las clases anteriores como una nueva versión
 * de las mismas (añade sufijo _v2) y realiza los siguientes cambios: • Ahora
 * los atributos ancho y alto serán privados. • Añade los métodos getter y
 * setter para ambos atributos. • Modifica la clase Triangulo obligados por los
 * cambios en su clase padre. • Haz una copia del programa anterior, sobre las
 * nuevas clases creadas, y comprueba que el programa creado en el ejercicio
 * anterior sigue funcionando.
 */
public class MLYt08e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        Triangulo_v2 triangulo = new Triangulo_v2(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        System.out.println("El area es: "+triangulo.area());
    }
}
