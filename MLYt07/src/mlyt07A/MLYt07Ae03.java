/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Random;

/**
 * 25/11/2022
 *
 * @author marta.lopezyanez Realiza un programa similar al anterior, pero que en
 * la parte ‘a’ garantice que no hay temperaturas repetidas. a. Llenar el Array
 * con valores al azar para todos los meses (entre 0 y 40).
 */
public class MLYt07Ae03 {

    public static void main(String[] args) {

        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);

            for (int j = 0; j < i; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) {
                    temperaturaMeses[i] = r.nextInt(41);
                    j = 0;
                }
            }
        }
        for (int temperatura : temperaturaMeses) {
            System.out.println("La temperatura es: " + temperatura);

        }

    }

}
