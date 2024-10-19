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
public class Asalariado extends Trabajador {

    private static int horasExtra;
    private static float salarioFinal;

    Asalariado(int i, String n, LocalDate fn, float sb) {
        super(i, n, fn, sb); 
        salarioFinal = getSalarioBase();
        horasExtra = 0;
    }

    public static void setHorasExtra(int he) {
        horasExtra = he;
    }

    public static int getHorasExtra() {
        return horasExtra;
    }

    public static void setsalarioFinal(float sf) {
        salarioFinal = sf;
    }

    public static float getSalarioFinal() {
        return salarioFinal;
    }

   public float calcularSalarioFinal(float precioHE){
   
   salarioFinal= getSalarioBase()+(horasExtra * precioHE);
   
   return salarioFinal;
   } 

}
