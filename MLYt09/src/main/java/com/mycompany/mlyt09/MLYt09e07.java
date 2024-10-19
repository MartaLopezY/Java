/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 25/1/2023
 *
 * @author marta.lopezyanez Volviendo a la parte final del último ejercicio del
 * capítulo anterior, haz un programa que cree un ArrayList que pueda contener
 * tanto Asalariados como ConsultoresExternos e introduzca “a mano” trabajadores
 * de ambos tipos en el ArrayList. • Después modificar el contenido del
 * ArrayList añadiendo 1 hora extra/horas trabajada a Asalariados y
 * ConsultoresExternos respectivamente. • Fijar el importe de hora extra a 20
 * euros y la hora de consultor a 100 euros y modificar de nuevo el ArrayList
 * calculando el salario final de cada trabajador. • Finalmente, recorriendo con
 * un for-each el ArrayList, obtener el total que gastará la empresa en
 * salarios.
 */
public class MLYt09e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<ConsultorExterno> consultoresexternos = new ArrayList<>();
        trabajadores.add(new Asalariado(1, "Juan", LocalDate.of(1970, 12, 18), 1000F));
        trabajadores.add(new Asalariado(2, "Laura", LocalDate.of(1980, 2, 12), 1200F));
        trabajadores.add(new Asalariado(3, "Maria", LocalDate.of(1990, 4, 23), 800F));
        trabajadores.add(new ConsultorExterno(4, "Antonio", LocalDate.of(1975, 5, 30)));
        trabajadores.add(new ConsultorExterno(5, "Lucia", LocalDate.of(1985, 9, 14)));
        trabajadores.add(new ConsultorExterno(6, "Martin", LocalDate.of(1995, 11, 21)));
        float gastoSalarios = 0;
        float salario;
         Asalariado.setHorasExtra(1);
          ConsultorExterno.setTrabajadas(1);
        for (Trabajador trab : trabajadores) {
            if (trab instanceof Asalariado asalariado) {
              salario=asalariado.calcularSalarioFinal(20);
              System.out.print("Su salario total es: " + salario); 
               gastoSalarios += salario;
            } if (trab instanceof ConsultorExterno consultorExterno) {
        
                salario=consultorExterno.calcularSalarioFinal(100); 
                System.out.print("Su salario total es: " + salario); 
                gastoSalarios += salario;  }
        }
       
        System.out.print("El gasto total en salarios es: " + gastoSalarios);
    }

}
