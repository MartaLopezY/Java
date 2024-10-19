/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt01;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt01e07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float kmAnterior, kmActual, litAnterior, litActual, media;

        System.out.println("Introduce el kilometraje anterior: ");
        kmAnterior = teclado.nextFloat();
        System.out.println("Introduce el kilometraje actual: ");
        kmActual = teclado.nextFloat();
        System.out.println("Introduce los litros de gasolina del ultimo repostaje: ");
        litAnterior = teclado.nextFloat();
        System.out.println("Introduce los litros de gasolina actuales: ");
        litActual = teclado.nextFloat();

        media = ((litActual - litAnterior)*100)/ (kmActual - kmAnterior);

        System.out.println("El consumo medio del automovil: " + media);

    }
}
