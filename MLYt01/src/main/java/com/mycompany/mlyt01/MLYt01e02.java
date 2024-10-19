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
public class MLYt01e02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float eur, dol;

        System.out.println("Valor en euros: ");
        dol = teclado.nextFloat();

        eur = dol / 1.14f;

        System.out.println("El valor en euros es:" + eur);

    }
}
