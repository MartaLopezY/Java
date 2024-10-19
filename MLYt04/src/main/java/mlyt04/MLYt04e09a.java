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
 * Programa que solicita que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje "Hola, me llamo nombre y tengo edad años". Hacer una versión utilizando la clase Format y otra versión con
el método System.out.printf.
 */
public class MLYt04e09a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre completo: ");
        String nombre = teclado.nextLine();
    
        System.out.println("Introduce la edad: ");
        String num = teclado.nextLine();
        int edad = Integer.parseInt(num);
        System.out.println("Hola, me llamo "+nombre+" y tengo "+edad+" años");

    }

}
