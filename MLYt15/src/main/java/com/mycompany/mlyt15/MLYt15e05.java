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
 * @author marta.lopezyanez. Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales si tienen
el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el ejercicio anterior
intentando incluir en el conjunto valores que no sean permitidos por esta nueva condición (por
ejemplo: Ana y ANA generarían un duplicado).
 */
public class MLYt15e05 {

    static LinkedHashSet<Persona_v2> personas;

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
        personas.add(new Persona_v2(n, t, m, f));
    }

    public static void edadMedia() {

        int suma = 0;
        for (Persona_v2 p : personas) {
            suma = suma + p.edad();
        }
        float media=(float)(suma/personas.size());
        System.out.println("La edad media es: "+ media);
    }

    public static void mayor() {
        Persona_v2 aux=new Persona_v2("", 0000L,"", LocalDate.now());
     
        for (Persona_v2 p : personas) {
            if(p.edad()>aux.edad()) aux = p;
        }
        
        System.out.println("La persona más mayor es: "+ aux.nombre);
    }

    public static void mostrarLista() {
        for (Persona_v2 p : personas) {
            System.out.println(p.nombre);
        }
    }
}
