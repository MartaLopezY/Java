/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 26/1/2023
 *
 * @author marta.lopezyanez
 */
public class Autobus extends Vehiculo  {

    protected static int numAsientos;

    Autobus(String mat,int n) {
        super(mat);
        numAsientos=n;

    }

    public static void setNumAsientos(int l) {
        numAsientos=l;
    }

    public static int getNumAsientos() {
        return numAsientos;
    }

    @Override
    public float salida() {
      long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) ((tiempoMinutos*0.04)+ numAsientos*0.25);
    }

    @Override
    public String toString() {
        String linea = String.format("El vehiculo de tipo autobús con matricula: %s con fecha y hora de llegada %s", matricula, horaLlegada);
        return linea;
    }

}
