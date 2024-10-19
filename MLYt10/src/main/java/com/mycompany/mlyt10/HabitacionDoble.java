/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.time.LocalDateTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 *
 *
 * @author marta.lopezyanez
 */
public class HabitacionDoble extends Habitacion {

    @Override
    public float checkOut() {
        float coste = (SECONDS.between(diaEntrada, LocalDateTime.now())) * 100;
        if (diaEntrada.getMonth() == Month.APRIL || diaEntrada.getMonth() == Month.JULY || diaEntrada.getMonth() == Month.AUGUST) {
            coste += 0.2 * coste;
        }
        ocupada = false;
        return coste;
    }

}
