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
dichas funciones: Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo
es.
 */
public class MLYt05e01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número entero: ");
        num = teclado.nextInt();

        if (par(num)) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido no es par");
        }
    }

    public static boolean par(int entero) {

        if (entero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
