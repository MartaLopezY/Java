/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 3/10/2022 Programa que permita calcular el sueldo
 * final de los vendedores de un concesionario de coches.
 */
public class MLYt03e22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sbase, hextra, venta, sfinal, i;
        boolean vendedor = true;
        while (vendedor) {
            System.out.println("Introduzca el sueldo base: ");
            sbase = teclado.nextInt();
            System.out.println("Introduzca el número de horas extra realizadas: ");
            hextra = teclado.nextInt();
            System.out.println("Introduzca el número de ventas: ");
            venta = teclado.nextInt();
            hextra = hextra * 100;
            if (venta >= 10 && venta <= 20) {
                hextra = hextra + 500;
            } else if (venta > 20 && venta <= 30) {
                hextra = hextra + 1000;
            } else if (venta > 30) {
                hextra = hextra + 1300;
            }
            sfinal = sbase + hextra;
            System.out.println("El sueldo final es: " + sfinal);
            System.out.println("Si quieres calcular el sueldo de más vendedores introduce un 1 sino introduce un número cualquiera");
            i = teclado.nextInt();
            if (i != 1) {
                vendedor = false;
            }
        }
    }
}
