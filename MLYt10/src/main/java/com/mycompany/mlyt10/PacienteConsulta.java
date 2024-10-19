/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.time.LocalDate;

/**
 * 26/1/2023
 *
 * @author marta.lopezyanez
 */
public class PacienteConsulta extends Paciente {

    PacienteConsulta(String n, LocalDate fn) {
        super(n,fn,"Consulta");
       
    }

    @Override
    public int facturar() {

        return 100;
    }

}
