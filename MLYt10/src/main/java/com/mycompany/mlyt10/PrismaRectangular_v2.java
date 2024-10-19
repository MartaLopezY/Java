/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

/**
 *
 *
 * @author marta.lopezyanez
 */
public class PrismaRectangular_v2 extends Figura3D_v2 {

    protected static double base;
    protected static double ancho;
    protected static double alto;

    PrismaRectangular_v2(PrismaRectangular_v2 fig) {
        super(fig.getNombre());
        base = fig.getBase();
        ancho = fig.getAncho();
        alto = fig.getAlto();
    }

    PrismaRectangular_v2(double b, double an, double al, String n) {
        super(n);
        base = b;
        ancho = an;
        alto = al;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setAncho(double an) {
        ancho = an;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double al) {
        alto = al;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double volumen() {

        return (base * ancho * alto);

    }
    @Override
    public double superficie() {

        return (base * ancho );

    }


}
