/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16/02/2023
 *
 * @author marta.lopezyanez. Realizar un programa que lea secuencialmente el
 * fichero fich02.txt línea a línea y lo muestre por pantalla, con el texto en
 * mayúscula.
 */
public class MLYt14e04 {

    public static void main(String[] args) {
        File f = new File("archivos" + File.separator + "fich02.txt");
        String cadena;
        try ( FileInputStream fis = new FileInputStream(f); 
              InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");  
              BufferedReader bfr = new BufferedReader(isr)) {
              while ((cadena = bfr.readLine()) != null) {
                System.out.println(cadena.toUpperCase());
            }
        } catch (IOException ex) {
            System.err.printf("Err:%s\n", ex.getMessage());
        }
    }
}
