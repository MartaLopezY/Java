/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt16;

import static java.lang.Long.toHexString;
import java.util.Scanner;

/**
 * 10/03/2023
 *
 * @author marta.lopezyanez.Realizar un programa al que se le introduzca un número entero. Mostrar dicho número en
su representación hexadecimal. Evitar que se produzca una excepción si el usuario no introduce un
valor correcto (por ejemplo, si introduce texto o un número con decimales o un número demasiado
grande).
 */
public class MLYt16e04 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
             int num = Integer.parseInt(teclado.nextLine());
     System.out.println("El numero entero en hexadecimal es: "+toHexString(num));
    }
}
