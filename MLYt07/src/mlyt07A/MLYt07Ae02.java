/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Random;

/**
 * 24/11/2022
 *
 * @author marta.lopezyanez Realiza un programa similar al anterior, con las
 * siguientes tareas:
 *
 */
public class MLYt07Ae02 {

    public static void main(String[] args) {
        // a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);
        }
        // b. Mostrar la temperatura media del año.
        int suma = 0;
        for (int temperatura : temperaturaMeses) {
            suma += temperatura;
        }
        System.out.println("La temperatura media del año es: " + (suma / 12));

        // c. Mostrar los meses en los que hizo más de 30 grados. 
        System.out.println("Los meses en que hizo más de 30 grados fueron: ");
        int mes = 1;
        for (int temperatura : temperaturaMeses) {
            if (temperatura > 30) {
                System.out.println(mes);
            }
            mes++;
        }

        /* d. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array, es decir, 
        en cuanto sepa que sí hay alguno, que pare de recorrer el array. Puedes usar break o return.*/
        boolean mayor = false;
        for (int temperatura : temperaturaMeses) {
            if (temperatura > 30) {
                mayor = true;
                break;
            }
        }
        if (mayor) {
            System.out.println("Hay algún mes con más de 30 grados");
        } else {
            System.out.println("No hay algún mes con más de 30 grados");
        }
        // e. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array pero ahora sin usar ni break ni return. 
        mayor = false;
        int i = 0;
        do {
            if (temperaturaMeses[i] > 30) {
                mayor = true;
                break;
            }
            i++;
        } while (i < 12 || mayor);
        if (mayor) {
            System.out.println("Hay algún mes con más de 30 grados");
        } else {
            System.out.println("No hay algún mes con más de 30 grados");
        }

        // f. Decir si hay alguna temperatura repetida en dos o más meses.
        boolean repetida = false;
        int j = 0;
        do {

            for (int k = 0; k < j; k++) {
                if (temperaturaMeses[k] == temperaturaMeses[k]) {
                    repetida = true;
                    break;
                }

            }
        } while (j < temperaturaMeses.length || repetida == false);

        if (repetida) {
            System.out.println("Hay alguna temperatura repetida en dos o más meses");
        } else {
            System.out.println("No  hay alguna temperatura repetida en dos o más meses");
        }
    }

}
