/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;
import java.util.Random;

/**
 * 9/2/2023
 *
 * @author marta.lopezyanez. Desarrolla una interfaz llamada Ciclista con un
 * método llamado recorrer() al que se le pasa un número de kilómetros y una
 * cadena con tipo de terreno y devuelve los segundos que tarda en recorrerlo.
 * Una interfaz llamada Nadador con un método llamado nadar a la que se le pasan
 * metros y devuelve los segundos en recorrerlo, y por último otra interfaz
 * llamada Saltador con un método saltarAltura que no recibe parámetros y que
 * devuelve los centímetros saltados. • Desarrolla una clase Delfin que
 * implemente la interfaz Nadador. El tiempo en recorrer una distancia es
 * aleatorio entre 40km/h y 70km/hora • Desarrolla una clase BallenaAzul que
 * implemente la interfaz Nadador. El tiempo en recorrer una distancia es de
 * 10km/h para las mayores de 5 años y 13km/h para las menores. • Desarrolla una
 * clase TriAtleta que implemente las tres interfaces, con los criterios que tu
 * consideres (pueden devolver valores aleatorios entre unos mínimos y máximos
 * que tú decidas o tener en cuenta otros parámetros como edad, sexo, etc.). •
 * Realiza un programa sencillo que cree instancias de delfines, ballenas azules
 * y triatletas y use los métodos desarrollados.
 */
public class MLYt10e09 {

    public static void main(String[] args) {

        ArrayList<Nadador> nadador = new ArrayList<>();
        ArrayList<TriAtleta> triatleta = new ArrayList<>();

        nadador.add(new Delfin());
        nadador.add(new Delfin());
        nadador.add(new BallenaAzul(5));
        nadador.add(new BallenaAzul(11));
        triatleta.add(new TriAtleta());
        triatleta.add(new TriAtleta());
        triatleta.add(new TriAtleta());

        for (Nadador nad : nadador) {
            Random r = new Random();
            float metros = r.nextFloat(100, 1000);
            System.out.println("El tiempo que tarda en recorrer "+metros+" metros es: " + nad.nadar(metros));
        }
        for (int i = 0; i < triatleta.size(); i++) {
            Random r = new Random();
            float metros = r.nextFloat(100, 1000);
            float km = r.nextFloat(5, 20);
            System.out.println("El tiempo que tarda en recorrer "+metros+" metros es: " +  triatleta.get(i).nadar(metros));
            System.out.println("Los centimetros que ha saltado son: " + triatleta.get(i).saltarAltura());
            if (i < 1) {
                System.out.println("El tiempo que tarda en recorrer "+km+" kilometros es: " + triatleta.get(i).recorrer(km, "montaña"));
            } else {
                System.out.println("El tiempo que tarda en recorrer "+km+" kilometros es: " +  triatleta.get(i).recorrer(km, "carretera"));
            }
        }

    }
}