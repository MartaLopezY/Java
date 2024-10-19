/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt01;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt01e04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int susp, sufi, not, sob;
        float aprob, notsob;

        System.out.println("Introduce el numero de suspensos: ");
        susp = teclado.nextInt();

        System.out.println("Introduce el numero de suficientes: ");
        sufi = teclado.nextInt();
        System.out.println("Introduce el numero de notables: ");
        not = teclado.nextInt();

        System.out.println("Introduce el numero de sobresalientes: ");
        sob = teclado.nextInt();
        aprob = (float)((sufi + not + sob) * 100) / (susp + sufi + not + sob);
        System.out.println("El porcentaje de aprobados es: " + aprob + "%");
        notsob =(float) ((not + sob) * 100) / (susp + sufi + not + sob);
        System.out.println("El porcentaje de notables y sobresalientes es: " + notsob +"%");

    }
}
