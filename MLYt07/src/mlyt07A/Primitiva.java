/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * 28/11/2022
 *
 * @author marta.lopezyanez Realizar una clase Primitiva que tenga definido un
 * Array privado de 6 elementos con el resultado de un sorteo de la primitiva
 * (serán 6 enteros con valores comprendidos entre 1 y 49 y sin repetidos). La
 * clase dispondrá de un constructor en el que se generan y almacenen esos
 * números al azar, también tendrá un método al que se le pase una combinación
 * jugada como parámetro (no necesariamente ordenada) y devuelva el número de
 * aciertos.
 */
public class Primitiva {

    private static final int[] numeros = new int[6];

    public void setNumeros() {
        Random r = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(49) + 1;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[i] = r.nextInt(49) + 1;
                    j = 0;
                }
            }
        }

    }

    public int getNumeros(int i) {

        return numeros[i];
    }

    public int comprobarBoleto(int[] boleto) {

        int acierto = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boleto[i] == numeros[j]) {
                    acierto++;

                }

            }

        }
        return acierto;
    }

    public int[] generarBoletoAlAzar() {

        Random random = new Random();
        int[] boletoAzar = new int[6];
        for (int i = 0; i < 6; i++) {
            boletoAzar[i] = random.nextInt(49) + 1;
            for (int j = 0; j < i; j++) {
                if (boletoAzar[i] == boletoAzar[j]) {
                    boletoAzar[i] = random.nextInt(49) + 1;
                    j = 0;
                }
            }
        }
        return boletoAzar;

    }
}
