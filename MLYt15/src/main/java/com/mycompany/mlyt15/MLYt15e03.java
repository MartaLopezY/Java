/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt15;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 27/2/2023
 *
 * @author marta.lopezyanez. Haz un programa que cree un conjunto HashSet que
 * almacene la lista de personas que van a una fiesta (de una persona sabemos su
 * nombre, teléfono, email y fecha de nacimiento). Crea en un archivo aparte la
 * clase Persona con los atributos y métodos que necesites. En el programa
 * introduce “a mano” unas cuantas personas, y luego muestre la edad media y el
 * nombre del mayor (también puedes crear un menú con la opción de añadir
 * persona y mostrar lista) • Intenta hacer una inserción de una persona
 * repetida ¿Qué ocurre? (Dos personas son iguales si tienen exactamente el
 * mismo nombre). • Muestra todos los valores almacenados en el HashSet ¿Tienen
 * algún orden?
 */
public class MLYt15e03 {

    static HashSet<Persona> personas;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        personas = new HashSet<>();
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
