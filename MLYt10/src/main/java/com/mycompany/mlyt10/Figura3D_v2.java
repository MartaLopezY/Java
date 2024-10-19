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
public abstract class Figura3D_v2 {

    protected static String nombre;

    Figura3D_v2(String n) {
        nombre = n;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double volumen();

    public abstract double superficie();

    @Override
    public String toString() {
        String linea = String.format("La figura: %s tiene una superficie: %f y un volumen: %f", nombre,superficie(), volumen());
        return linea;
    }

}
