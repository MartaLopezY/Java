/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/* 24/10/2022
 *
 * @author marta.lopezyanez
Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a
dichas funciones:Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros
que tiene
 */
public class MLYt05e01d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado;
        System.out.println("Introduce un número: ");
        String cadena = teclado.nextLine();
        resultado = contarCeros(cadena);
        System.out.println("La cantidad de ceros introducida es:" + resultado);

    }

    public static int contarCeros(String cadena) {

        int longitud = cadena.length();
        int contador = 0;
        for (int i = 0; i < longitud; i++) {
            char aux = cadena.charAt(i);
            if ((Character.compare('0', aux)) == 0) {
                contador++;
            }

        }
        return contador;
    }

}
