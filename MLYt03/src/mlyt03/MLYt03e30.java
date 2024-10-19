/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 5/10/2022 Programa modifica el programa anterior para que si un cliente introduce un número negativo o mayor
que 10 le informe de su error y le obligue a meter correctamente las entradas que desea, las veces
que sea necesario hasta que lo haga bien.
 *
 */
public class MLYt03e30 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ent, comp,max=0;
        System.out.println("Introduzca el número de entradas: ");
        ent = teclado.nextInt();
        while (ent > 0) {
            do {
                System.out.println("Introduzca el número de entradas a comprar: ");
                comp = teclado.nextInt();
                if (comp > 10) {
                    System.out.println("El número máximo de entradas permitidas por clientes es de 10");
                }
                if (comp > ent) {
                    System.out.println("El número de entradas restantes es menor que el que quiere comprar");
                }
                  if (comp <0) {
                    System.out.println("El número de entradas introducido es negativo");
                }
            } while (comp > 10 || comp>ent || comp<0);
            if(max<comp) max=comp;
            ent = ent - comp;
            System.out.println("El número de entradas restantes es de: "+ ent);
        }
System.out.println("El número mayor de entradas por cliente ha sido de: "+max);
    }

}
