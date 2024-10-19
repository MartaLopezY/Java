/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;


/**
 * 30/01/2023
 *
 * @author marta.lopezyanez. Copia la última versión de las clases de los
 * primeros ejercicios: Figura2D, Triangulo, TrianColor y Rectangulo (añade
 * sufijo _v9) y realiza los siguientes cambios: • Crea un método abstracto
 * llamado area () en Figura2D que ha de implementarse en las clases hijas. •
 * Crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que
 * use el método abstracto anterior. • Verificar que las clases hijas
 * implementan el método area (). ¿Qué ocurriría si no lo tuviesen implementado?
 * • Haz un programa que almacene figuras de los tres tipos en un ArrayList y
 * finalmente se recorra el ArrayList con un for-each mostrando el precio de
 * cada figura, suponiendo un precio de 10 euros el metro cuadrado.
 */
public class MLYt10e01 {

    public static void main(String[] args) {

        ArrayList<Figura2D_v9> figuras = new ArrayList<>();

                    figuras.add(new Triangulo_v9(10D, 4D, "isosceles", "figura1"));
                    figuras.add(new Rectangulo_v9(3, 6, "figura2"));
                    figuras.add(new TrianColor_v9(5, 3, "equilatero", "azul", "figura3"));    
                    figuras.add(new Triangulo_v9(11, 9, "isosceles", "figura4"));
                    figuras.add(new Rectangulo_v9(2, 5, "figura5"));
                    figuras.add(new TrianColor_v9(4, 7, "rectangulo", "rojo", "figura"));


        for (Figura2D_v9 fig : figuras) {

            System.out.println("El precio de la figura es: " + fig.precioMetroCuadrado(10));
        }

    }
}
