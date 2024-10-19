/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 17/11/2022
 *
 * @author marta.lopezyanez Diseña una clase llamada Alumno para gestionar los
 * alumnos de una escuela. Contiene los atributos: nombre completo, DNI, fecha
 * de nacimiento y nombre de la escuela (común para todos los alumnos). Además
 * del constructor, los métodos set y get para cada atributo, tendrá los
 * siguientes métodos: - Método que nos dice si es mayor de edad o no. - Método
 * al que se le pase como parámetro otro alumno y nos devuelva true si el alumno
 * pasado es menor que él mismo. False en caso contrario. - Método al que se le
 * pase como parámetro otro alumno y nos devuelva true si el alumno pasado es
 * exactamente igual en todos los campos (un duplicado). False en caso
 * contrario. Realiza a continuación un programa sencillo que use la clase
 * definida.
 *
 */
public class MLYt06e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre de la escuela: ");
        String esc = teclado.nextLine();
        Alumno.setNombreEscuela(esc);
        System.out.println("Introduce el nombre del alumno: ");
        String n = teclado.nextLine();

        System.out.println("Introduce el dni del alumno: ");
        String d = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento: ");
        String f = teclado.nextLine();
        LocalDate miFecha = LocalDate.parse(f);
        Alumno alumno1 = new Alumno(miFecha);
        alumno1.setNombre(n);
        alumno1.setDNI(d);
        if (alumno1.mayoredad()) {
            System.out.println("El alumno es mayor de edad");
        } else {
            System.out.println("El alumno no es mayor de edad");
        }
        System.out.println("Introduce el nombre del alumno: ");
        n = teclado.nextLine();
        System.out.println("Introduce el dni del alumno: ");
        d = teclado.nextLine();

        System.out.println("Introduce la fecha de nacimiento: ");
        f = teclado.nextLine();
        miFecha = LocalDate.parse(f);
        Alumno alumno2 = new Alumno(miFecha);
        alumno2.setNombre(n);
        alumno2.setDNI(d);
        if (alumno2.menor(alumno1)) {
            System.out.println("El alumno1 es menor que el alumno2");
        } else {
            System.out.println("El alumno2 es menor que el alumno1");
        }
        if (alumno2.igual(alumno1)) {
            System.out.println("Son el mismo alumno");
        } else {
            System.out.println("No son el mismo alumno");
        }
         System.out.println("El nombre de la escuela es: "+ Alumno.getNombreEscuela());
          System.out.println("El nombre del alumno 1 es: "+ alumno1.getNombre());
           System.out.println("El dni del alumno 1 es: "+ alumno1.getDNI());
    }

}
