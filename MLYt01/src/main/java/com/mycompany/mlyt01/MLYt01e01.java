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
public class MLYt01e01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float eur, dol;

        System.out.println("Valor en euros: ");
        eur = teclado.nextFloat();

        dol = eur * 1.14f;

        System.out.println("El valor en dolares es:" + dol);

    }
}
