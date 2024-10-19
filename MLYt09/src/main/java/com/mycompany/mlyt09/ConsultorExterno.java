/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDate;

/**
 * 18/1/2023
 *
 * @author marta.lopezyanez
 */
public class ConsultorExterno extends Trabajador {

    private static int horasTrabajadas;
    private static float salarioFinal;

    ConsultorExterno(int i, String n, LocalDate fn) {
        super(i, n, fn, 0); //Le paso 0 como salario base
        salarioFinal = 0;
        horasTrabajadas = 0;      
    }

    public static void setTrabajadas(int ht) {
        horasTrabajadas = ht;
    }

    public static int getTrabajadas() {
        return horasTrabajadas;
    }

    public static void setsalarioFinal(float sf) {
        salarioFinal = sf;
    }

    public static float getSalarioFinal() {
        return salarioFinal;
    }

   public float calcularSalarioFinal(float precioHT){
   
   salarioFinal= horasTrabajadas * precioHT;
   
   return salarioFinal;
   } 

}
