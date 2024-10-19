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
dichas funciones:Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
 */
public class MLYt05e01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, resultado;
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro número entero: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce otro número entero: ");
        num3 = teclado.nextInt();
        resultado = mayor(num1, num2, num3);
        System.out.println("El número mayor es:" + resultado);

    }

    public static double mayor(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

}
