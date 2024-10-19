/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDate;

/**
 * 26/1/2023
 *
 * @author marta.lopezyanez
 */
public class Paciente  {

    protected static String  nombre;
    protected static LocalDate fechaNacimiento;
    protected static String motivoConsulta;

    Paciente(String n, LocalDate fn, String mC) {
    nombre=n;
   fechaNacimiento=fn;
   motivoConsulta=mC;
      
    }

    public static void setNombre(String n) {
        nombre=n;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setFechaNacimiento(LocalDate fn) {
        fechaNacimiento=fn;
    }

    public static LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
  public static void setMotivoConsulta(String mC) {
         motivoConsulta=mC;
    }

    public static String getMotivoConsulta() {
        return motivoConsulta;
    }
   public int facturar(){
   
   return 100;
   } 
     @Override
    public String toString() {
        String linea = String.format("El paciente: %s ha sido llamado para %s", nombre,motivoConsulta);
        return linea;
    }

}
