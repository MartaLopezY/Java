/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt07b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 02/12/2022
 *
 * @author marta.lopezyanez Realiza un programa que tenga un ArrayList llamado
 * AlturaAlumnos que mantenga una lista con las alturas de los alumnos de un
 * centro. Serán valores positivos entre 0,50 y 2,50 redondeados a dos
 * decimales. El programa tendrá las siguientes funciones (accesibles mediante
 * un menú): a. Añadir altura. b. Mostrar lista actual con el número de posición
 * c. Eliminar por posición. Se le pasa como parámetro una posición y elimina la
 * altura en dicha posición. d. Eliminar por valor. Se le pasa como parámetro
 * una altura y elimina todas las posiciones en las que se encuentre dicha
 * altura. Devuelve la cantidad de eliminaciones. e. Ordenar la lista. f. Vaciar
 * la lista.
 */
public class MLYt07e15 {

    public static void main(String[] args) {

        ArrayList<Float> altura = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    System.out.println("Añade la altura: ");
                    altura.add(teclado.nextFloat());
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("La lista actual es: ");
                    for (int i = 0; i < altura.size(); i++) {
                        System.out.print(i + altura.get(i));
                    }

                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    System.out.print("Introduce la posición a eliminar: ");
                    int pos = teclado.nextInt();
                    altura.remove(pos);
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    System.out.print("Introduce el valor a eliminar: ");
                    float valor=teclado.nextFloat();
                     altura.remove(valor);
                }
                case 5 -> {
                    System.out.println("\tElegiste opción 5");
                    Collections.sort(altura);
                    System.out.print("La lista ordenada es: ");
                }
                case 6 -> {
                    System.out.println("\tElegiste opción 6");
                    System.out.print("Has vaciado la lista");
                    altura.clear();
                }
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Añadir altura");
        System.out.println("2 Mostrar lista actual");
        System.out.println("3 Eliminar por posición");
        System.out.println("4 Eliminar por valor");
        System.out.println("5 Ordenar la lista.");
        System.out.println("6 Vaciar la lista.");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
