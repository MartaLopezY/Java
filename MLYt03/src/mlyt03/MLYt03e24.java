/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 3/10/2022 Programa que permite introducir el sexo
 * (‘H’,’M’) y la edad de los 30 trabajadores de una fábrica. El programa obliga
 * a que las edades que se introduzcan estén comprendidas entre 16 y 70 años. El
 * programa muestra la edad y el sexo del más joven, la media de edad de las
 * mujeres y si hay alguno con más de 60 años. Si se introduce cero como edad el
 * programa terminará en ese momento sin esperar a que introduzcan los 30
 * trabajadores
 */
public class MLYt03e24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad = 1, joven = 70, muj = 0;
        float media = 0;
        char sexo = 'X', sexjov = 'X';
        boolean mayor = false;
        for (int i = 0; i < 30; i++) {
            do {
                System.out.println("Introduzca la edad: ");
                edad = teclado.nextInt();
            } while ((edad < 16 || edad > 70) && edad != 0);
            if (edad == 0) {
                break;
            }
            System.out.println("Introduzca el sexo (H/M): ");
            sexo = teclado.next().charAt(0);

            if (sexo == 'M') {
                muj++;
                media = media + edad;
            }

            if (edad < joven) {
                joven = edad;
                sexjov = sexo;
            }
            if (edad > 60) {
                mayor = true;
            }
        }
        if (edad != 0) {
            media = (float) media / muj;
            System.out.println("La edad del más joven es : " + joven + " y el sexo " + sexjov);
            System.out.println("La edad media de las mujeres es: " + media);
            if (mayor) {
                System.out.println("Hay personas mayores de 60");
            } else {
                System.out.println("No hay personas mayores de 60");
            }
        }
    }
}
