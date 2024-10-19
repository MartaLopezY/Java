/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt01;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt01e10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float x, y, area;
        System.out.print("Introduce la coordenada x: ");
        x = teclado.nextInt();
        System.out.print("Introduce la coordenada y: ");
        y = teclado.nextInt();
        area=abs(x*y);
        
        System.out.println("El area del rectangulo formado es: " + area);
     

    }
}
