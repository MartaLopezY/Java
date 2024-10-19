/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;


/**
 * 8/2/2023
 *
 * @author marta.lopezyanez. Crea una nueva clase PoligonoIrregular (no es hija de Figura2D ni de ninguna otra clase) que
tiene como único atributo un ArrayList con la longitud de todos los lados del mismo. Haz que esta
clase implemente Perimetrable. Crea un programa sencillo con una instancia de PoligonoIrregular y
que calcule su perímetro. Añade al programa un ArrayList de figuras (PoligonoIrregular,
Rectangulo_v10, Triangulo_v10, Triancolo_v10) y que muestre el perímetro de todos ellos.
- ¿Tiene sentido que Perimetrable sea interfaz y no clase abstracta? ¿Por qué?
 */
public class MLYt10e08 {

    public static void main(String[] args) {

        ArrayList<Perimetrable> figuras = new ArrayList<>();
        ArrayList<Float> lados = new ArrayList<>();
        lados.add(16.5f);
        lados.add(1.5f);
        lados.add(8.3f);
        lados.add(2.4f);
                    figuras.add(new Triangulo_v10(10D, 4D, "isosceles", "figura1"));
                    figuras.add(new Rectangulo_v10(3, 6, "figura2"));
                    figuras.add(new TrianColor_v10(5, 3, "equilatero", "azul", "figura3"));    
                    figuras.add(new Triangulo_v10(11, 9, "isosceles", "figura4"));
                    figuras.add(new Rectangulo_v10(2, 5, "figura5"));
                    figuras.add(new TrianColor_v10(4, 7, "rectangulo", "rojo", "figura"));
                    figuras.add(new PoligonoIrregular(lados));


        for (Perimetrable fig : figuras) {

            System.out.println("El perimetro de la figura es: " + fig.calcularPerimetro());
        }

    }
}
