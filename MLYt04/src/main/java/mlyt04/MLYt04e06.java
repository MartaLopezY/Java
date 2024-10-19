/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;


import java.util.Scanner;

/**
 * 20/10/2022
 *
 * @author marta.lopezyanez Programa al que se le introduzca un email y nos
 * devuelva el nombre del dominio es decir, lo que está entre la arroba y el
 * punto
 */
public class MLYt04e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce un email: ");
        String cadena = teclado.nextLine();
        int pos1,pos2;
        pos1= cadena.indexOf('@');
        pos2= cadena.indexOf('.');
        String dominio = cadena.substring(pos1+1, pos2);
        System.out.println("El dominio del email introducido es: " + dominio);
    }

}
