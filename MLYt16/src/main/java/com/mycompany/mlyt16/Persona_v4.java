/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * 18/1/2023
 *
 * @author marta.lopezyanez
 */
public class Persona_v4 {

    public String nombre;
    public long telefono;
    public String email;
    LocalDate fechaNacimiento;
    public Genero gen;

    Persona_v4(String n, long t, String m, LocalDate f, Genero g) {
        nombre = n;
        telefono = t;
        email = m;
        fechaNacimiento = f;
        gen = g;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona_v4 other = (Persona_v4) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (this.nombre.toUpperCase().equals(other.nombre.toUpperCase())) {
            return false;
        }

        return Objects.equals(this.email, other.email);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre.toUpperCase());
        hash = 67 * hash + (int) (this.telefono ^ (this.telefono >>> 32));
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.fechaNacimiento);
        return hash;
    }

    public int edad() {

        return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Persona_v4{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", gen=" + gen + '}';
    }
    
    

}
