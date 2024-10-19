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
public class PacienteRecetas extends Paciente {

    protected static int medicamentos;

    PacienteRecetas(String n, LocalDate fn, int med) {
        super(n,fn,"recetas");
        medicamentos=med;
      
    }

    public static void setMedicamentos(int med) {
        medicamentos=med;
    }

    public static int getMedicamentos() {
        return medicamentos;
    }

    @Override
   public int facturar(){
   
   return (5*medicamentos);
   } 

}
