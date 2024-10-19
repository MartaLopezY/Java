/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;



import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 *
 *
 * @author marta.lopezyanez
 */
public class HabitacionLowcost extends Habitacion {

   
@Override
   public  float checkOut(){
       
       ocupada=false;
   return ((SECONDS.between(diaEntrada,LocalDateTime.now()))*50);
   } 

}
