/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt02;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 * Programa que lee un número entero e indica si está comprendido entre 10 y 20
 */
public class MLYt02e01f {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
     
        if (num>=10 && num<=20) {
            System.out.println("el número esta entre 10 y 20");
        } 
        else  System.out.println("el número no esta entre 10 y 20");
        } 
    }
