/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;

import java.io.PrintStream;


/**
 * 9/1/2023
 *
 * @author marta.lopezyanez 
 */
public class Figura2D {

  
    public static double ancho;
    public static double alto;

Figura2D(double b, double h){
ancho=b;
alto=h;

}

    public void verDim() {
        PrintStream printf = System.out.printf("El ancho es: %.2f y el alto es: %.2f ", ancho,alto);
    }

   
}
