/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt16;

import java.util.Scanner;

/**
 * 15/03/2023
 *
 * @author marta.lopezyanez.Escribe un programa que solicite al usuario que introduzca una cadena y verifique, mediante
expresiones regulares, si la cadena se corresponde con:
a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas).
b) Un número binario de una o más posiciones.
c) Un número hexadecimal de entre 5 y 8 posiciones.
d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes).
e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito.
f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas
y minúsculas, números, guiones y guiones bajos (entre 2 y 15 caracteres)
 */
public class MLYt16e05c {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número en hexadecimal (0 a 9 y de A a F): ");
             String numero = teclado.nextLine();
             String regexp="\\d  | \\w {5,8} ([0-9] | [A-F])";
             if(numero.matches(regexp))   System.out.println("El número es correcto");
  
    }
}
