/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;



/**
 * 9/1/2023
 *
 * @author marta.lopezyanez 
 */
public class Triangulo extends Figura2D{

public String estilo;
   
Triangulo(double b, double h,String e){
   super(b,h);
   estilo=e;
   }

    public double area() {
        double a = (ancho*alto)/2;
        return a;
    }

    public void verEstilo() {

        System.out.println(estilo);
    }

    
}
