/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 5/10/2022 Programa para llevar el control de venta
 * de entradas. Lo primero que ha de hacer es pedir la cantidad de entradas que
 * se pondrán a la venta, después irá solicitando la cantidad de entradas que
 * quiere comprar, estando limitado a un máximo de 10 por cliente. El programa
 * finaliza cuando se agoten las entradas mostrando la cantidad de entradas que
 * se ha llevado el que más ha comprado.
 *
 */
public class MLYt03e29 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ent, comp, max = 0;
        System.out.println("Introduzca el número de entradas: ");
        ent = teclado.nextInt();
        while (ent > 0) {

            System.out.println("Introduzca el número de entradas a comprar: ");
            comp = teclado.nextInt();
            if (comp > 10) {
                System.out.println("El número máximo de entradas permitidas por clientes es de 10");
                comp = 10;
            }
            if (comp > ent) {
                System.out.println("El número de entradas restantes es menor que el que quiere comprar");
                comp = ent;
            }
            if (max < comp) {
                max = comp;
            }
            ent = ent - comp;
            System.out.println("El número de entradas restantes es de: " + ent);
        }
        System.out.println("El número mayor de entradas por cliente ha sido de: " + max);
    }

}
