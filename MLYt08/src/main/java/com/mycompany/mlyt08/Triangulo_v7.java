/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez Copia las clases anteriores como una nueva versión
 * de las mismas (añade sufijo _v7) y realiza los siguientes cambios: •
 * Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro
 * objeto de tipo Figura2D_v7 y que copiará todos sus datos. • Hacer otro
 * constructor análogo para la clase Triangulo_v7. • Hay un programa que cree un
 * Triangulo_v7 con el constructor de 3 parámetros creado previamente, y otro
 * triángulo utilizando el nuevo constructor. Mostrar el área de ambos.
 */
public class Triangulo_v7 extends Figura2D_v7 {

    public String estilo;

    Triangulo_v7(Triangulo_v7 trian) {
        super(trian.getAncho(), trian.getAlto());
        estilo = trian.estilo;
    }

    Triangulo_v7(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    Triangulo_v7() {
        super();
        estilo = null;
    }

    Triangulo_v7(double l) {
        super(l);
        estilo = "igualBaseAltura";
    }

    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }

    public void verEstilo() {

        System.out.println(estilo);
    }

}
