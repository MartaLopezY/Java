/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt05;

import java.util.Scanner;
import java.util.Random;

/* 24/10/2022
 *
 * @author marta.lopezyanez
Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a
dichas funciones:Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al
azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos
mayores que cero, en caso contrario devuelve -1)
 */
public class MLYt05e01e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Introduce un número: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = teclado.nextInt();
        resultado = aleatorio(num1, num2);
        if (resultado == -1) {
            System.out.println("Los numeros introducidos son incorrectos");
        } else {
            System.out.println("El número aleatorio entre los introducidos es: " + resultado);
        }

    }

    public static int aleatorio(int num1, int num2) {
        Random r = new Random();
        if (num1 > num2 || num1 < 0 || num2 < 0) {
            return -1;
        } else {
            return r.nextInt(num1, num2) + 1;
        }

    }

}
