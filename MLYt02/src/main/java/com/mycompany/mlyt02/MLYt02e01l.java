/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee tres números enteros y dice si hay alguno mayor que cero.
 */
public class MLYt02e01l {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2,num3;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2 = teclado.nextInt();
         System.out.println("Introduzca otro numero: ");
        num3 = teclado.nextInt();
        if (num1 >0 || num2>0 || num3>0) {
            System.out.println("Alguno de los números es mayor que 0");
        } 
        else  System.out.println("Ninguno de los números es mayor que 0");
        } 
    }
