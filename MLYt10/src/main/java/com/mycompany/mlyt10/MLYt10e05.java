/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2/2/2023
 *
 * @author marta.lopezyanez. Pensando que en el futuro implementemos el juego de
 * ajedrez para dos jugadores, se desea crear una clase abstracta llama
 * PiezaAjedrez, con dos atributos enteros llamados fila y columna que
 * representan sus coordenadas en el tablero (valores entre 0 y 7) y un método
 * abstracto llamado mover () al que se le pasan como parámetro la fila y
 * columna destino de un movimiento. El método devolver true si el movimiento se
 * puede realizar o false si es un movimiento erróneo. Implementa esa clase y
 * sus subclases AlfilAjedrez y TorreAjedrez. Para simplificarlo, vamos a pensar
 * en movimientos en un tablero vacío, es decir solo con una pieza, la que se
 * está movimiento. • Haz un programa que permita al usuario mover una sola
 * pieza (al comenzar elegirá Alfil o Torre) por el tablero, partiendo de la
 * posición 0,0, indicando las coordenadas destino del movimiento que quiere
 * hacer cada vez, terminando el programa cuando introduzca fila -1. • El
 * programa tendrá una función que presente por pantalla la situación del
 * tablero. • Por comodidad, puedes hacer las clases dentro del mismo fichero
 * que el programa.
 */
public class MLYt10e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila = 0;
        int columna;

        ArrayList<PiezaAjedrez> piezas = new ArrayList<>();

        piezas.add(new AlfilAjedrez());
        piezas.add(new TorreAjedrez());
     
            System.out.println("\n\n\n");
            System.out.println("Elija una pieza:");
            System.out.println("0 Mover Alfil");
            System.out.println("1 Mover Torre");
           int opcion = Integer.parseInt(teclado.nextLine());
        
             do { {

                System.out.println("Elija la fila de destino de 1 a 7: ");
                fila = Integer.parseInt(teclado.nextLine());
                System.out.println("Elija la columna de destino de 1 a 7: ");
                columna = Integer.parseInt(teclado.nextLine());
                piezas.get(opcion).mover(fila, columna);
                System.out.println("Pulsa 0 si quiere ver  tablero");
                if(Integer.parseInt(teclado.nextLine())==0)verTablero(piezas);
            }
        } while (fila != -1);

    }

    public static void verTablero(ArrayList<PiezaAjedrez> piezas) {

        for (PiezaAjedrez pie : piezas) {
            pie.toString();
        }
    }
}
