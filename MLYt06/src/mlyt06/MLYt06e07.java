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
public class MLYt06e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Circulo circulo = new Circulo();
        System.out.println("Introduce el radio del circulo: ");
        int r = teclado.nextInt();
        Circulo.setRadio(r);
        System.out.println("La circunferencia del circulo es: " + circulo.calcularCircunferencia());
        System.out.println("La superficie del circulo es: " + circulo.calcularSuperficie());
        System.out.println("El diametro del circulo es: " + circulo.calcularDiametro());
        System.out.println("El radio del circulo es: " + Circulo.getRadio());
    }

}




