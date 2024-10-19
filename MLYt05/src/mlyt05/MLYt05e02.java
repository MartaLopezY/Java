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
Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –
necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará
base y altura – d) Salir. Usar funciones para cada una de las 3 opciones.
 */
public class MLYt05e02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float area;
        int num = 0;
        while (num != 4) {
            System.out.println("Introduce el area a calcular:");
            System.out.println("1-Circulo");
            System.out.println("2-Cuadrado");
            System.out.println("3-Triángulo");
            System.out.println("4-Salir");
            num = teclado.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("Introduce el radio del circulo");
                    int radio = teclado.nextInt();
                    area = circulo(radio);
                    System.out.println("El área del circulo es: " + area);
                }
                case 2 -> {
                    System.out.println("Introduce el lado del cuadrado");
                    int lado = teclado.nextInt();
                    area = cuadrado(lado);
                    System.out.println("El área del cuadrado es: " + area);
                }
                case 3 -> {
                    System.out.println("Introduce la base del triángulo");
                    int base = teclado.nextInt();
                    System.out.println("Introduce la altura del triángulo");
                    int altura = teclado.nextInt();
                    area = triangulo(base, altura);
                    System.out.println("El área del triángulo es: " + area);
                }
                case 4 -> {
                }
                default -> System.out.println("Opción introducida incorrecta");

            }
        }
    }

    public static float circulo(int radio) {
        return (float) (Math.PI * (radio * radio));

    }

    public static int cuadrado(int lado) {

        return (lado * lado);
    }

    public static float triangulo(int base, int altura) {

        return ((float) (base * altura) / 2);
    }
}
