/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt04;


import java.util.Scanner;

/**
 * 20/10/2022
 *
 * @author marta.lopezyanez
 *
 * Un algoritmo de encriptado monoalfabético consiste en la sustitución de una
 * letra por otra a lo largo de todo el mensaje, por ejemplo las A por F, las B
 * por X, las C por M. Obviamente si la A pasa a ser F, ninguna otra letra
 * pasará F. Hacer un programa que le introduzca una cadena en mayúsculas y
 * muestre la cadena encriptada (todo lo que no sean letras mayúsculas se deja
 * intacto: números, espacios en blanco, etc.).Hacer una segunda versión que
 * funcione con mayúsculas y minúsculas.
 */
public class MLYt04e07b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();
        int longitud = cadena.length();
        String plantillaMay = "ABCDEFGHIJKLMNñOPQRSTUVWXYZ";
        String plantillaMin = "abcdefghijklmnñopqrstuvwxyz";
        String cad2 = "";
        for (int i = 0; i < longitud; i++) {

            char letra = cadena.charAt(i);
            int posicionMay = plantillaMay.indexOf(letra);
            int posicionMin = plantillaMin.indexOf(letra);
            char nueva;
            if (posicionMay != -1) {
                nueva = plantillaMay.charAt(26 - posicionMay);
            } else if  (posicionMin != -1) {
                nueva = plantillaMin.charAt(26 - posicionMin);
            }else  {
                nueva = letra;
            }

            cad2 = cad2 + nueva;
            }
            System.out.println("El texto encriptado es: " + cad2);
        }

    }
