/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;

import java.time.LocalDate;

/**
 * 18/1/2023
 *
 * @author marta.lopezyanez
 */
public class Trabajador {

    private static int id;
    private static String nombre;
    private static LocalDate fechaNacimiento;
    private static float salarioBase;

    Trabajador(int i, String n, LocalDate fn, float sb) {
        id = i;
        nombre = n;
        fechaNacimiento = fn;
        salarioBase = sb;
    }
    public static void setId(int i) {
        id = i;
    }
    public static int getId() {
        return id;
    }
     public static void setNombre(String n) {
        nombre = n;
    }
    public static String getNombre() {
        return nombre;
    }
       public static void setFechaNacimiento(LocalDate fn) {
        fechaNacimiento = fn;
    }
    public static LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
     public static void setSalarioBase(float sb) {
        salarioBase = sb;

    }
    public static float getSalarioBase() {
        return salarioBase;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
if (obj == null) return false;
if (obj instanceof Trabajador == false) return false;
   Trabajador other = (Trabajador) obj;
if (Trabajador.id == Trabajador.id ) return true;
return false;
    }
  @Override
    public String toString() {
        String linea = String.format("El trabajador: %s con %d, su fecha de nacimiento es: %t y su salario base es: %f", nombre,id,fechaNacimiento,salarioBase);
        return linea;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

}
