/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;

/**
 * 9/2/2023
 *
 * @author marta.lopezyanez. Empleando las tres clases definidas en el ejercicio
 * anterior (Delfín, BallenaAzul y TriAtleta) y la interfaz Nadador, realiza un
 * programa que contenga un ArrayList de nadadores (polimorfismo de interfaces)
 * con tres elementos, uno de cada tipo, esto es un Delfín, una BallenaAzul y un
 * TriAtleta. A continuación, recorre el ArrayList con un bucle for…each,
 * mostrando cuánto tarda cada uno de ellos en recorrer un kilómetro.
 */
public class MLYt10e10 {

    public static void main(String[] args) {

        ArrayList<Nadador> nadador = new ArrayList<>();

        nadador.add(new Delfin());
        nadador.add(new BallenaAzul(5));
        nadador.add(new TriAtleta());

        for (Nadador nad : nadador) {
            System.out.println("El tiempo que tarda en recorrer un kilometro es es: " + nad.nadar(1000));
        }
    }
}
