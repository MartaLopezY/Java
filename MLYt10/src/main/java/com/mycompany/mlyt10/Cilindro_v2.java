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
public class Cilindro_v2 extends Figura3D_v2 {

    protected static double radio;
    protected static double alto;

    Cilindro_v2(Cilindro_v2 fig) {
        super(fig.getNombre());
        radio = fig.getRadio();
        alto = fig.getAlto();
    }

    Cilindro_v2(double r, double a, String n) {
        super(n);
        radio = r;
        alto = a;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setAlto(double al) {
        alto = al;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double volumen() {

        return Math.PI * Math.pow(radio, 2) * alto;

    }

    @Override
    public double superficie() {

        return (2 * Math.PI * radio * (radio + alto));

    }

}
