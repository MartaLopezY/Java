/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Arrays;

/**
 * 30/11/2022
 *
 * @author marta.lopezyanez Realizar un programa que tenga una función a la que
 * se le pasa un Array con las edades de los alumnos de una clase y nos devuelva
 * la edad media. Añadir una función a la que se le pasa un Array con las edades
 * de los alumnos y nos devuelva un Array solo con los mayores de edad.
 */
public class MLYt07Ae09 {

    public static void main(String[] args) {
        int[] e = {18, 17, 19, 20, 18, 17, 21};
        float media = calcularMediaEdades(e);
        System.out.println("La media es: " + media);

        int[] mayor = mayorEdad(e);
        System.out.println("El array solo con mayores de edad es: " + Arrays.toString(mayor));
    }

    public static float calcularMediaEdades(int[] edades) {
        int suma = 0;
        for (int edad : edades) {
            suma += edad;

        }
        float media = (float) suma / edades.length;
        return media;
    }

    public static int[] mayorEdad(int[] edades) {
        int longitud = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                longitud++;
            }
        }
        int[] mayor = new int[longitud];
        int j = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                mayor[j] = edades[i];
                j++;
            }
        }
        return mayor;

    }
}
