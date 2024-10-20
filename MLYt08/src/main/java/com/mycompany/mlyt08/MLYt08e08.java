/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez. Copia la última versión de las clases Figura2D,
 * Triangulo, Triancolor como una nueva versión de las mismas (añade sufijo _v8)
 * y realiza los siguientes cambios: • Añadir a la clase Figura2D_v8 un atributo
 * privado llamado nombre de tipo String. • Añadir el getter/setter de ese campo
 * y modificar los constructores de dicha clase para incorporar como parámetro
 * el nombre de la figura (en el constructor por defecto se le asignará valor
 * null). • Modificar las clase hija (Triangulo_v8) y nieta (Triancolor_v8) para
 * incluir el nombre en constructores. • Crear una nueva clase hija de
 * Figura2D_v8 llamada Rectangulo_v8 con constructor con tres parámetros (alto,
 * ancho, nombre), constructor con un dos parámetros (alto igual a ancho y
 * nombre) y un método que devuelve boolean llamado esCuadrado(). • Hacer un
 * programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros
 * no, y cuente cuantos hay cuadrados. En el mismo main() crear un triancolor a
 * los que le asignes también el nuevo atributo: nombre y muestres su área.
 */
public class MLYt08e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList< Rectangulo_v8> rectangulos = new ArrayList<>();
        int cuadrado = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce el nombre: ");
            String nom = teclado.nextLine();
            System.out.println("Introduce el ancho:");
           double b = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el alto:");
            double h = Double.parseDouble(teclado.nextLine());       
            rectangulos.add(new Rectangulo_v8(b, h, nom));
            if (rectangulos.get(i).esCuadrado()) {
                cuadrado++;
            }
        }
        System.out.println("El número de cuadrados introducidos es: " + cuadrado);
         System.out.println("Introduce el nombre: ");
        String nom = teclado.nextLine();
          System.out.println("Introduce el estilo(isósceles,rectángulo,equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el color: ");
        String col = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        TrianColor_v8 triangulo = new TrianColor_v8(b, h, est, col, nom);
        System.out.println("El área del triangulo es: " + triangulo.area());

    }
}
