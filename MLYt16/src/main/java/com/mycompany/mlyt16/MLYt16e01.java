/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt16;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 10/03/2023
 *
 * @author marta.lopezyanez. Crea una enumeración pública con el género de las
 * personas (masculino, femenino) en un archivo propio. Crea una nueva versión
 * de la clase Persona (Persona_v4) que la incorpore como atributo y adapta los
 * métodos necesarios para tratarla (constructor, toString, etc). Haz un
 * programa que solicite al usuario por consola los datos de personas y los
 * almacene en un HashSet (Introducirá nombre “Z” para indicar que no desea
 * introducir más personas). Finalmente mostrará todos los datos almacenados en
 * el conjunto.
 */
public class MLYt16e01 {

    static HashSet<Persona_v4> personas;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        personas = new HashSet<>();
        String n = "";
        while (n.equals("Z") == false) {
            System.out.println("Introduce un nombre");
            n = teclado.nextLine();
            System.out.println("Introduce un telefono");
            Long t = Long.parseLong(teclado.nextLine());
            System.out.println("Introduce un email");
            String m = teclado.nextLine();
            System.out.println("Introduce la fecha de nacimiento AAAA-MM-DD");
            LocalDate f = LocalDate.parse(teclado.nextLine());           
            System.out.println("Introduce el genero: (masculino/femenino)");
            Genero g =Genero.valueOf( teclado.nextLine());
             personas.add(new Persona_v4(n, t, m, f,g));
        }
         for (Persona_v4 p : personas) {
            p.toString();
        }

    }
}
