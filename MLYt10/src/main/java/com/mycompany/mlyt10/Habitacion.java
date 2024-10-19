/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;


import java.time.LocalDateTime;

/**
 *
 *
 * @author marta.lopezyanez
 */
public abstract class Habitacion  {
protected boolean ocupada;
protected LocalDateTime diaEntrada;


    public Habitacion() {
        ocupada=false;
    }

   public void checkIn(){
   diaEntrada=LocalDateTime.now(); 
   ocupada=true;
  
   }
   public abstract float checkOut(); 

}
