/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;



/**
 * 19/1/2023
 *
 * @author marta.lopezyanez 
 */
public class Triangulo_v6 extends Figura2D_v6{

public String estilo;
   
Triangulo_v6(double b, double h,String e){
   super(b,h);
   estilo=e;
   }
Triangulo_v6(){
   super();
   estilo=null;
   }
Triangulo_v6(double l){
   super(l);
   estilo="igualBaseAltura";
   }

    public double area() {
        double a = (getAncho()*getAlto())/2;
        return a;
    }

    public void verEstilo() {

        System.out.println(estilo);
    }

    
}
