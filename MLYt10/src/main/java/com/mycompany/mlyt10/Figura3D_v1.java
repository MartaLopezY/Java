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
public abstract class Figura3D_v1 {

    protected static String nombre;
     Figura3D_v1(String n) { 
        nombre = n;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double volumen();
    @Override
    public String toString() {
        String linea = String.format("La figura: %s tiene un volumen: %f", nombre,volumen());
        return linea;
    }

}
