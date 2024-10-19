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
public class HabitacionSuite extends Habitacion {

    @Override
    public float checkOut() {
        float coste = (SECONDS.between(diaEntrada, LocalDateTime.now())) * 200;
        if ((SECONDS.between(diaEntrada, LocalDateTime.now()))>10) {
            coste = (float) (coste-( 0.2 * coste));
        }
        ocupada = false;
        return coste;
    }

}
