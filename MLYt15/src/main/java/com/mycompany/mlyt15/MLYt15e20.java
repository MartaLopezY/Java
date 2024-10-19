/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 9/3/2023
 *
 * @author marta.lopezyanez.En el tema 7 hicimos varios ejercicios sobre el
 * sorteo de la Primitiva (con array y arraylist). Ahora que conoces estas
 * nuevas colecciones. ¿Cuál elegirías para obtener los números premiados de un
 * sorteo de Primitiva? Recuerda que eran 6 números aleatorios sin repetidos y
 * ordenados ascendentemente. Haz el código para ver lo sencillo que sería
 * obtener esos números en comparación a realizarlo mediante ArrayList. La mejor
 * opción sería un TreeSet
 */
public class MLYt15e20 {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numeros = new TreeSet<>();
        while (numeros.size() < 6) {
            numeros.add(random.nextInt(49) + 1);
        }

    }

}
