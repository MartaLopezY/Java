/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt15;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 9/3/2023
 *
 * @author marta.lopezyanez. Repite el ejercicio anterior con un LinkedHashSet ¿Qué ha cambiado?
 * Es similar al HashSet, pero los elementos, además del almacenamiento de tipo hash, están enlazados
entre sí según el orden de inserción.
 */
public class MLYt15e04 {

    static LinkedHashSet<Persona> personas;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        personas = new LinkedHashSet<>();
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    añadirPersona();
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    edadMedia();
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    mayor();
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    mostrarLista();
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
        System.out.println("1 Añadir persona");
        System.out.println("2 Mostrar la edad media");
        System.out.println("3 Mostrar el mayor");
        System.out.println("4 Mostrar lista");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    public static void añadirPersona() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String n = teclado.nextLine();
        System.out.println("Introduce un telefono");
        Long t = Long.parseLong(teclado.nextLine());
        System.out.println("Introduce un email");
        String m = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento AAAA-MM-DD");
        LocalDate f = LocalDate.parse(teclado.nextLine());
        personas.add(new Persona(n, t, m, f));
    }

    public static void edadMedia() {

        int suma = 0;
        for (Persona p : personas) {
            suma = suma + p.edad();
        }
        float media=(float)(suma/personas.size());
        System.out.println("La edad media es: "+ media);
    }

    public static void mayor() {
        Persona aux=new Persona("", 0000L,"", LocalDate.now());
     
        for (Persona p : personas) {
            if(p.edad()>aux.edad()) aux = p;
        }
        
        System.out.println("La persona más mayor es: "+ aux.nombre);
    }

    public static void mostrarLista() {
        for (Persona p : personas) {
            System.out.println(p.nombre);
        }
    }
}
