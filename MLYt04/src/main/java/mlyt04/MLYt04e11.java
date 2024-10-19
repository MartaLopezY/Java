/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 * 20/10/2022
 *
 * @author marta.lopezyanez
 *
 * Describe que realiza el código siguiente e indica si contiene algún error.
java.util.Scanner teclado = new java.util.Scanner(System.in);
System.out.println("Introduce una cadena:");
String cadena = teclado.nextLine();
StringBuilder cadenaSB = new StringBuilder(cadena);
int pos;
do {
pos = cadenaSB.indexOf(" ");
if (pos!=-1) cadenaSB.deleteCharAt(pos);
} while (pos != -1);
System.out.println(cadenaSB);
 */
public class MLYt04e11 {

    public static void main(String[] args) {
        
java.util.Scanner teclado = new java.util.Scanner(System.in); 
System.out.println("Introduce una cadena:");
String cadena = teclado.nextLine();
StringBuilder cadenaSB = new StringBuilder(cadena);
int pos;
do {
pos = cadenaSB.indexOf(" ");
if (pos!=-1) cadenaSB.deleteCharAt(pos);
} while (pos != -1);
System.out.println(cadenaSB);
        }

    }
//El programa lee un texto por teclado y me devuelve el texto eliminando los espacios
