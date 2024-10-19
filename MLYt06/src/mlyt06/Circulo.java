/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.util.Scanner;

/**
 * 16/11/2022
 *
 * @author marta.lopezyanez Implementar una clase llamada Circulo, que tiene
 * solo la propiedad radio y los métodos setRadio, getRadio,
 * calcularCircunferencia, calcularSuperficie, calcularDiametro además de un
 * constructor. Crea un programa que use esta clase creando un par de círculos y
 * usando los métodos creados. ¿El atributo radio puede ser privado?
 */
public class Circulo {

    private static int radio;
    public double calcularCircunferencia;
    public double calcularSuperficie;
    public int calcularDiametro;

   

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int rad) {
        radio = rad;
    }

    public double calcularCircunferencia() {
        double circunferencia = Math.PI * radio * 2;
        return circunferencia;
    }

    public double calcularSuperficie() {

        double superficie = Math.PI * Math.pow(radio, 2);
        return superficie;
    }

    public int calcularDiametro() {

        int diametro = 2 * radio;
        return diametro;
    }
}
