/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 *  28/9/2022
 * Programa al que le vamos introduciendo las edades de los alumnos (-1 para finalizar) y nos informa si alguno es menor de edad  hasta que se teclee el -1.
 */
public class MLYt03e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        

        do {
            System.out.println("Introduzca la edad del alumnno: ");
            edad = teclado.nextInt();
            if (edad < 0)   System.out.println("La edad introducida es incorrecta");
            else { if (edad<18) System.out.println("Sí hay alguno");
            }

        } while (edad != -1);
    }

}
