/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

/**

 *
 * @author marta.lopezyanez
 */
public class Rectangulo_v8 extends Figura2D_v8 {

    Rectangulo_v8(double b, double h, String n) {
        super(b, h, n);

    }

    public double area() {
        double a = (getAncho() * getAlto());
        return a;
    }

    public boolean esCuadrado() {
        if (getAncho() == getAlto()) {
            return true;
        } else {
            return false;
        }
    }

}
