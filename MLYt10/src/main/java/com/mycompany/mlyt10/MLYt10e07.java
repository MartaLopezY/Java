/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;


/**
 *6/2/2023
 *
 * @author marta.lopezyanez. Crea una interfaz llamada Perimetrable con un solo método llamado calcularPerimetro al que
no se le pasa ningún parámetro y devuelve un double con el perímetro de la clase que la implemente.
Copia las clases Figura2D, Triangulo, TrianColor y Rectangulo en su última versión (añade sufijo _v10)
y modifica la nueva Figura2D para que implemente Perimetrable.
- ¿Qué ocurre al añadir esta implementación? ¿Se produce algún error de compilación?
- ¿Por qué? ¿Hay alguna forma rápida de arreglar ese error?
- Modifica las clases necesarias para que calculen el perímetro correctamente (supón que los
triángulos son equiláteros para simplificar el cálculo)
Haz un programa sencillo que cree instancias de Triangulo, TrianColor y Rectangulo y muestre su
perímetro.
 */
public class MLYt10e07 {

    public static void main(String[] args) {

        ArrayList<Figura2D_v10> figuras = new ArrayList<>();

                    figuras.add(new Triangulo_v10(10D, 4D, "isosceles", "figura1"));
                    figuras.add(new Rectangulo_v10(3, 6, "figura2"));
                    figuras.add(new TrianColor_v10(5, 3, "equilatero", "azul", "figura3"));    
                    figuras.add(new Triangulo_v10(11, 9, "isosceles", "figura4"));
                    figuras.add(new Rectangulo_v10(2, 5, "figura5"));
                    figuras.add(new TrianColor_v10(4, 7, "rectangulo", "rojo", "figura"));


        for (Figura2D_v10 fig : figuras) {

            System.out.println("El perimetro de la figura es: " + fig.calcularPerimetro());
        }

    }
}
