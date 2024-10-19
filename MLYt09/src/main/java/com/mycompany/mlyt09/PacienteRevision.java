/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 26/1/2023
 *
 * @author marta.lopezyanez
 */
public class PacienteRevision extends Paciente {

    protected static LocalDate fechaUltimaRevision;

    PacienteRevision(String n, LocalDate fn, LocalDate fUR) {
        super(n, fn, "revision");
        fechaUltimaRevision = fUR;
    }

    public static void setFechaUltimaRevision(LocalDate fUR) {
        fechaUltimaRevision = fUR;
    }

    public static LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    @Override
    public int facturar() {
        if (ChronoUnit.YEARS.between(PacienteRevision.fechaNacimiento, LocalDate.now()) > 65) {
            return 30;
        }
        return 50;
    }

}
