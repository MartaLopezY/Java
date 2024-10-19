/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt16;

/**
 * 10/03/2023
 *
 * @author marta.lopezyanez.Realizar, a partir de los atributos estáticos de las
 * wrapper class, un programa que muestre el valor máximo y mínimo de los
 * Integer y los Long y también cuantos bytes ocupan en memoria.
 */
public class MLYt16e03 {

    public static void main(String[] args) {
        System.out.println("El tamaño minimo de un Integer es: " + Integer.MIN_VALUE);
        System.out.println("El tamaño máximo de un Integer es: " + Integer.MAX_VALUE);
        System.out.println("El tamaño minimo de un Long es: " + Long.MIN_VALUE);
        System.out.println("El tamaño máximo de un Long es: " + Long.MAX_VALUE);
        System.out.println("El tamaño en bytes de un Integer es: " + (Integer.SIZE/8));
        System.out.println("El tamaño en bytes de un Long es: " + (Long.SIZE/8));

    }
}
