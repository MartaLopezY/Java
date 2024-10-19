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
public class Furgoneta extends Vehiculo  {

    protected static int longitud;

    Furgoneta(String mat,int l) {
        super(mat);
        longitud=l;

    }

    public static void setLongitud(int l) {
        longitud = l;
    }

    public static int getLongitud() {
        return longitud;
    }

    @Override
    public float salida() {
      long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) ((tiempoMinutos*0.04)+ longitud*0.20);
    }

    @Override
    public String toString() {
        String linea = String.format("El vehiculo de tipo furgoneta con matricula: %s con fecha y hora de llegada %s", matricula, horaLlegada);
        return linea;
    }

}
