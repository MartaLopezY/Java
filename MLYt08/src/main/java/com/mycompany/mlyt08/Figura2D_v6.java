/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;

import java.io.PrintStream;


/**
 * 19/1/2023
 *
 * @author marta.lopezyanez 
 */
public class Figura2D_v6 {

  
    private static double ancho;
    private static double alto;

Figura2D_v6(double b, double h){
ancho=b;
alto=h;
}
Figura2D_v6(double l){
ancho=l;
alto=l;
}
Figura2D_v6(){
ancho=0;
alto=0;
}
 public void setAncho(double a){
ancho=a;
}  
 public double getAncho(){
 return ancho;
 }
 public void setAlto(double a){
alto=a;
}  
 public double getAlto(){
 return alto;
 }

    public void verDim() {
        PrintStream printf = System.out.printf("El ancho es: %.2f y el alto es: %.2f ", ancho,alto);
    }

   
}
