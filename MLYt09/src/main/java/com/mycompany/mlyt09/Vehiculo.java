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
public class Vehiculo {

    protected static String matricula;
    protected static LocalDateTime horaLlegada;

    Vehiculo(String mat) {
        matricula = mat;
        horaLlegada=LocalDateTime.now();

    }

    public static void setMatricula(String mat) {
        matricula = mat;
    }

    public static String getMatricula() {
        return matricula;
    }

    public float salida() {
      long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) (tiempoMinutos*0.04);
    }

    @Override
    public String toString() {
        String linea = String.format("El vehiculo de tipo general con matricula: %s con fecha y hora de llegada %s", matricula, horaLlegada);
        return linea;
    }
    public boolean equals(String mat) {
       
    if (mat.equals(Vehiculo.matricula)){
            return true;
        }
        return false;
    }

 

}
