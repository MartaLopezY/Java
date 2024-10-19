/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mlyt09;


/**
 *20/01/2023
 * @author marta.lopezyanez. Realiza un programa con una variable de tipo Figura2D_v8, y sobre ella llama a uno de los
constructores de Triangulo_v8. Muestra sus dimensiones y el cálculo del área.
 */
public class MLYt09e01 {

    public static void main(String[] args) {

 Figura2D_v8 figura;
 figura = new  Triangulo_v8  (2.5,3,"isosceles","fig1");
 figura.verDim();
System.out.println ( ((Triangulo_v8)figura).area());     
    }    
}
