/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 19/10/2022 Programa para obtener la letra del DNI a
 * partir del número
 */
public class MLYt04e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni, num;
        System.out.println("Introduzca el número de DNI: ");
        dni = teclado.nextInt();
        num = dni % 23;
        char letra = cadena.charAt(num);
        System.out.println("La letra del dni es la " + letra);

    }
}
