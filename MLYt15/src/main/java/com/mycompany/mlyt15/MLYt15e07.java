/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt15;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 9/3/2023
 *
 * @author marta.lopezyanez.Realizar un programa que tenga un HashMap que
 * almacene una plantilla de jugadores de un equipo (Nombre, salario). La
 * plantilla tiene un máximo de 25 jugadores. El programa dispondrá de menú que
 * permita: añadir jugador, eliminar jugador, lista jugadores con su salario y
 * que tenga también opción que permita introducir un salario y muestre los
 * jugadores que tiene un salario parecido al introducido (por “parecido”
 * entendemos que el salario del jugador esté en un rango de 6000 euros arriba o
 * abajo respecto al introducido).
 */
public class MLYt15e07 {

    static HashMap<String, Double> plantilla = new HashMap<>();

    public static void main(String[] args) {
        boolean salir = false;

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    añadir();
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    eliminar();
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    consultarTodos();
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    consultarUno();
                }
                case 5 -> {
                    System.out.println("\tElegiste opción 5");
                    consultarSalarioSimilar();
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
        System.out.println("1 Añadir");
        System.out.println("2 Eliminar");
        System.out.println("3 Consultar todos");
        System.out.println("4 Consultar uno");
        System.out.println("5 Consultar jugadores con salario similar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    public static void añadir() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)) {
            System.out.println("Error: jugador ya existe");
        } else if (plantilla.size() < 25) {
            System.out.println("Introduce el salario");
            double salario = Double.parseDouble(teclado.nextLine());
            plantilla.put(nombre, salario);
            System.out.println("Jugador añadido");
        } else {
            System.out.println("Ya se ha alcanzado el máximo de jugadores");
        }
    }

    public static void eliminar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre a borrar");
        String nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)) {
            plantilla.remove(nombre);
            System.out.println("jugador borrado");
        } else {
            System.out.println("jugador no existe");
        }
    }

    public static void consultarTodos() {
        for (String key : plantilla.keySet()) {
            System.out.println(key + "-->" + plantilla.get(key));
        }
    }

    public static void consultarUno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre a consultar");
        String nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)) {
            System.out.println("Salario-->" + plantilla.get(nombre));
        } else {
            System.out.println("jugador no existe");
        }
    }

    public static void consultarSalarioSimilar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el salario a consultar");
        double salario = Double.parseDouble(teclado.nextLine());
        for (String key : plantilla.keySet()) {
            if (plantilla.get(key) >= salario - 6000 || plantilla.get(key) <= salario + 6000) {
                System.out.println(key + "-->" + plantilla.get(key));
            }
        }
    }

}
