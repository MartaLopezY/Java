/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

/**
 * 28/11/2022
 *
 * @author marta.lopezyanez Realizar una clase Primitiva que tenga definido un
 * Array privado de 6 elementos con el resultado de un sorteo de la primitiva
 * (serán 6 enteros con valores comprendidos entre 1 y 49 y sin repetidos). La
 * clase dispondrá de un constructor en el que se generan y almacenen esos
 * números al azar, también tendrá un método al que se le pase una combinación
 * jugada como parámetro (no necesariamente ordenada) y devuelva el número de
 * aciertos. Realiza tres programas distintos que usen esa clase:
 *
 */
public class MLYt07Ae05 {

    public static void main(String[] args) {
        int aciertos;
        int[] boleto = new int[6];
        Primitiva premiado = new Primitiva();
        premiado.setNumeros();

        // Programa que el usuario introduzca los 6 números de su boleto y le diga cuantos acertó.
        boleto = premiado.generarBoletoAlAzar();
        aciertos = premiado.comprobarBoleto(boleto);
        System.out.println("El numero de aciertos es " + aciertos);
        /*Programa en el que se generen 1000 boletos al azar y nos informe de cuantos
  boletos hay con 3, 4, 5 y 6 aciertos (a lo mejor es necesario crear un nuevo
  método en la clase Primitiva para generar boletos al azar). */
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        for (int i = 0; i < 1000; i++) {
            aciertos = 0;
            boleto = premiado.generarBoletoAlAzar();
            aciertos = premiado.comprobarBoleto(boleto);
            switch (aciertos) {
                case 3->
                    tres++;
                case 4->
                    cuatro++;
                case 5->
                    cinco++;
                case 6->
                    seis++;
            }

        }
        System.out.println("El numero de boletos con 3 aciertos es " + tres);
        System.out.println("El numero de boletos con 4 aciertos es " + cuatro);
        System.out.println("El numero de boletos con 5 aciertos es " + cinco);
        System.out.println("El numero de boletos con 6 aciertos es " + seis);
        // Programa con un bucle que genere boletos hasta que acierte los 6 números ¿Cuántos boletos has tenido que crear?
        seis = 0;
        int jugada = 0;
        do {
            boleto = premiado.generarBoletoAlAzar();
            aciertos = premiado.comprobarBoleto(boleto);
            if (aciertos == 6) {
                seis++;
            }
            jugada++;
        } while (seis != 1);
        System.out.println("El numero de boletos generados hasta conseguir 6 aciertos es " + jugada);
    }

}
