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
public class Esfera_v1 extends Figura3D_v1 {

    protected static double radio;

    Esfera_v1(Esfera_v1 fig) {
        super(fig.getNombre());
        radio = fig.getRadio();

    }

    Esfera_v1(double r, String n) {
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

}
