/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee dos números enteros y dice si al menos uno de los dos es mayor de 10
 */
public class MLYt02e01e {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduzca un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
        num2 = teclado.nextInt();
        if (num1 >10 || num2>10) {
            System.out.println("Alguno de los dos son mayores que 10");
        } 
        else  System.out.println("Ninguno es mayor de 10");
        } 
    }
