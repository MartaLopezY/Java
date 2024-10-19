/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * 18/1/2023
 *
 * @author marta.lopezyanez
 */
public class Persona {

  public String nombre;
  public long telefono;
  public String email;
  LocalDate fechaNacimiento;

    Persona(String n, long t,String m, LocalDate f) {
     nombre=n;
             telefono=t;
             email=m;
            fechaNacimiento =f;
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
        final Persona_v2 other = (Persona_v2) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
         if (this.nombre.equals(other.nombre)) {
            return false;
        }
   
   
        return Objects.equals(this.email, other.email);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + (int) (this.telefono ^ (this.telefono >>> 32));
        hash = 59 * hash + Objects.hashCode(this.email);
        return hash;
    }

    

   

 
public int edad(){


return (int) ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now());
}

}
