/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mlyt13;

import java.util.Scanner;

/**
 *10/2/2023
 * @author marta.lopezyanez. Haz un programa que solicite al usuario dos números enteros y los intente dividir (división
entera, sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no
que capturará la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por
cero, informando al usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división,
que será cero en caso de cualquiera de los dos errores posibles.
 */
public class MLYt13e03 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
           int division=0;
        System.out.println("Introduce un numero entero");
        int num1=teclado.nextInt();
         System.out.println("Introduce un numero entero");
        int num2=teclado.nextInt();
        try{
        division=num1/num2;}catch(Exception e){ division=0;
         System.out.println("Error"+e.getMessage());}
        finally{
        System.out.println("La division es: "+division);
        }
    }
}
