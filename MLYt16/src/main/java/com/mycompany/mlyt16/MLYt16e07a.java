/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 15/03/2023
 *
 * @author marta.lopezyanez.Crea una clase de tipo genérica llamada ListaPequeña
 * que tendrá como atributos privados un ArrayList de tipo genérico llamado
 * valores y un entero (qué será final, piensa el porqué) con el tamaño de la
 * lista, llamado tamañoMax. • Al constructor de esta clase le pasaremos un
 * entero positivo que se asignará a tamañoMax. El constructor instanciará
 * también el ArrayList valores. • Tendrá un método llamado añadir que se le
 * pasa un objeto de tipo genérico y si el arraylist aún tiene un tamaño menor
 * que tamañoMax, lo añadirá, pero si el arraylist ha llegado a ese tamaño,
 * añadirá objeto pasado en la última posición del ArrayList, sustituyendo el
 * elemento que allí hubiera (así conseguimos que el ArrayList no crezca por
 * encima del tamaño máximo) • Tiene un método llamado clear(), que simplemente
 * hace un clear() del ArrayList valores. • Tiene un método llamado getValores()
 * que devuelve el ArrayList privado valores. Haz un programa que cree una
 * ListaPequeña de tipo String de 5 elementos. Añádele 6 ó 7 String a la lista y
 * muestra su contenido, para ver si ha crecido por encima de esos 5 elementos.
 * Crea otro programa similar al anterior, pero en vez de trabajar con String
 * trabaje con una clase que hayas creado previamente, por ejemplo: Persona_v4.
 */
public class MLYt16e07a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaPequeña<String> lista = new ListaPequeña<>(5);
        lista.añadir("elemento 1");
        lista.añadir("elemento 2");
        lista.añadir("elemento 3");
        lista.añadir("elemento 4");
        lista.añadir("elemento 5");
        lista.añadir("elemento 6");
        ArrayList<String> valores= new ArrayList<>();
        valores=lista.getValores();
        for (String v : valores) {
            System.out.println("->"+v);
        }
    }

}
