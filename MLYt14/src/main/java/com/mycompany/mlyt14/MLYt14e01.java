/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 15/02/2023
 *
 * @author marta.lopezyanez. Realizar un programa que escriba distintas líneas
 * con un texto cualquiera (con eñes y acentos) en un fichero llamado fich01.txt
 * especificando la codificación UFT-8. El fichero estará almacenado en la
 * carpeta archivos creada previamente. Una vez que funcione realiza los
 * siguientes cambios: a) Incorpora File.separator para componer la ruta del
 * archivo. b) Modifica la codificación, pasándola a ISO-8859-1.
 */
public class MLYt14e01 {

    public static void main(String[] args) {
        File f = new File("archivos" + File.separator + "fich01.txt");
        try (   FileOutputStream fos = new FileOutputStream(f, true);  
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); 
                //OutputStreamWriter osw =new OutputStreamWriter(fos,"ISO-8859-1");
                BufferedWriter bfw = new BufferedWriter(osw)) {
                    bfw.write("Esto es un texto");
                    bfw.newLine();
                    bfw.write("Esto es otro texto con eñe");
                 } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }
}
