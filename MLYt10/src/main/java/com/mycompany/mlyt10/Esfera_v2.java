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
public class Esfera_v2 extends Figura3D_v2 {

    protected static double radio;

    Esfera_v2(Esfera_v2 fig) {
        super(fig.getNombre());
        radio = fig.getRadio();

    }

    Esfera_v2(double r, String n) {
        super(n);
        radio = r;

    }

    public void setRadio(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double volumen() {

        return (4 * Math.PI * Math.pow(radio, 3) / 3);

    }
    @Override
    public double superficie() {

        return (4 * Math.PI * Math.pow(radio, 2));

    }

}
