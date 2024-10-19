/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

/**
 
 *
 * @author marta.lopezyanez 
 */
public class Triangulo_v9 extends Figura2D_v9 {

    public String estilo;

    Triangulo_v9(Triangulo_v9 trian) {
        super(trian.getAncho(), trian.getAlto(),trian.getNombre());
        estilo = trian.estilo;
    }

    Triangulo_v9(double b, double h, String e,String n) {
        super(b, h,n);
        estilo = e;
    }

    Triangulo_v9() {
        super();
        estilo = null;
    }

    Triangulo_v9(double l,String n) {
        super(l,n);
        estilo = "igualBaseAltura";
    }

    @Override
    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }

    public void verEstilo() {

        System.out.println(estilo);
    }

}
