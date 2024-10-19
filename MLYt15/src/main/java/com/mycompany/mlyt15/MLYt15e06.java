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
 * @author marta.lopezyanez. Realizar un programa que tenga un HashMap que
 * almacene una plantilla de jugadores de un equipo (Nombre, salario). El
 * programa dispondrá de un menú que permita: añadir jugador, eliminar jugador,
 * consultarTodos el salario de un jugador e incrementar el salario un 10% a un
 * empleado.
 */
public class MLYt15e06 {
    
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
                    aumentarSalario();
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
        System.out.println("5 Aumentar salario");
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
        } else {
            System.out.println("Introduce el salario");
            double salario = Double.parseDouble(teclado.nextLine());
            plantilla.put(nombre, salario);
            System.out.println("Jugador añadido");
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

    public static void aumentarSalario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre a aumentar salario");
        String nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)) {
            double nuevoSalario=(plantilla.get(nombre))* 1.10d;
            plantilla.put(nombre,nuevoSalario);
        } else {
            System.out.println("jugador no existe");
        }
    }
}
