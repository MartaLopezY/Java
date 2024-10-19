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
public class Figura2D_v8 {

private static String nombre;
 private static double ancho;
 private static double alto;
Figura2D_v8(Figura2D_v8 fig){
ancho=fig.getAncho();
alto=fig.getAlto();
}
Figura2D_v8(double b, double h,String n){
ancho=b;
alto=h;
nombre=n;
}
Figura2D_v8(double l,String n){
ancho=l;
alto=l;
nombre=n;
}
Figura2D_v8(){
ancho=0;
alto=0;
nombre=null;
}
 public void setNombre(String n){
nombre=n;
}  
 public String getNombre(){
 return nombre;
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
