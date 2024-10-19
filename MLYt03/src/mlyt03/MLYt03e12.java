/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 28/9/2022
 * Programa que se le introduzcan las notas con
 * decimales (Se introducirá –1 para indicar que no hay más notas) El algoritmo
 * nos da el total de notas introducidas, calculará la nota mínima, máxima , la
 * media, si hay algún 5.0 exacto, y el porcentaje de aprobados. Hay que validar
 * que estén entre 0 y 10.
 *
 */
public class MLYt03e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota, min, max, suma, media, porc;
        int aprob, exacto, i;
        min = 11;
        max = -1;
        suma = 0;
        aprob = 0;
        exacto = 0;
        i = 0;
        do {
            System.out.println("Introduzca una nota: ");
            nota = teclado.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota introducida es incorrecta");
            } else {
                suma = suma + nota;
                if (nota > max) {
                    max = nota;
                }
                if (nota < min) {
                    min = nota;
                }
                if (nota >= 5) {
                    aprob++;
                }
                if (nota == 5) {
                    exacto++;
                }
                i++;
            }
        } while (nota != -1);
        media = suma / i;
        porc = (aprob * 100) / i;
        System.out.println("El número de alumnos es: " + i);
        System.out.println("La media es: " + media);
        System.out.println("El porcentaje de aprobados es: " + porc + "%");
        System.out.println("La nota minima es: " + min);
        System.out.println("La nota máxima es: " + max);
        System.out.println("El número de alumnos que han aprobado con 5 exacto es: " + exacto);
    }

}
