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
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 16/02/2023
 *
 * @author marta.lopezyanez.Realizar un programa que escriba distintas líneas de
 * texto en un fichero llamado alumnos.csv, que contenga en cada línea: nombre
 * del alumno, fecha de nacimiento, y notas de las tres evaluaciones (con dos
 * decimales). Cada uno de los campos estará separado por un punto y coma. El
 * programa finalizará cuando se introduzca ‘Z’ como nombre de alumno. Este
 * puede ser un caso donde puede ser muy cómodo usar la clase PrintWriter.
 */
public class MLYt14e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in,"UTF-8");
        File f = new File("archivos" + File.separator + "alumnos.csv");
        try (   FileOutputStream fos = new FileOutputStream(f, true);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); 
                BufferedWriter bfw = new BufferedWriter(osw);
PrintWriter pw = new PrintWriter(bfw, true)) {
             String nombre="";
            while(nombre.equals("Z")==false){
                 System.out.println("Nombre:");
                 nombre=teclado.nextLine();   
                  if (nombre.equals("Z")==false){ 
            System.out.println("Fecha de nacimiento (DD-MM-AAAA); ");
            String fecha=teclado.nextLine();  
             System.out.println("Nota1: ");            
            float nota1=Float.parseFloat(teclado.nextLine());   
             System.out.println("Nota2: ");
            float nota2=Float.parseFloat(teclado.nextLine());     
            System.out.println("Nota3: ");
            float nota3=Float.parseFloat(teclado.nextLine()); 
            pw.printf("%s;%s;%.2f;%.2f;%.2f",nombre,fecha,nota1,nota2,nota3);          
            pw.println("");}
            }
            
        }catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }
}
