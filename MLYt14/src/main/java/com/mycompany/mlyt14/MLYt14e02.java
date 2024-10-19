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
import java.util.Scanner;

/**
 *16/02/2023
 * @author marta.lopezyanez. Basándote en el ejercicio anterior, haz un programa en el usuario introduzca palabras o frases
y se vayan escribiendo como líneas separadas en un fichero llamado fich02.txt. El programa finaliza
cuando el usuario teclee “fin”. Para definir el objeto teclado para introducir texto especifica la
codificación de la consola mediante: Scanner teclado = new Scanner(System.in, "ISO-8859-1");
 */
public class MLYt14e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
       File f = new File("archivos" + File.separator + "fich02.txt");
try (
FileOutputStream fos =new FileOutputStream(f, true);
OutputStreamWriter osw =new OutputStreamWriter(fos,"ISO-8859-1"); 
BufferedWriter bfw = new BufferedWriter(osw)) {
  String texto;   
    do{
         texto=teclado.nextLine();
         bfw.write(texto); bfw.newLine(); 
       }while (texto.equals("fin")==false);

} catch (IOException ex) {
   System.err.printf("Error:%s",ex.getMessage()); }
   String texto;

    }
}
