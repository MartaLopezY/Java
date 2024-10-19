/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 24/02/2023
 *
 * @author marta.lopezyanez.Realizar un programa que lea el fichero alumnos.csv
 * línea a línea y finalmente muestre la cantidad de alumnos que tienen una nota
 * final >=5 y el nombre del alumno con mejor nota. (La nota final se calcula
 * redondeando un 20% de la primera evaluación más un 30% de la segunda más 50%
 * de la tercera). Prueba a cargar el archivo alumnos.csv en una hoja de cálculo
 * con LibreOffice Calc. Si el archivo tiene coma como separador decimal,
 * tenemos que reemplazarlo por punto antes de convertir a número, si no
 * fallará: Double.parseDouble(textoNota)
 */
public class MLYt14e10 {

    public static void main(String[] args) throws IOException {

        String archivo = "alumnos.csv";
        String separador = ",";

        try ( BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int cantidadAprobados = 0;
                Alumno mejorAlumno = null;
                double mejorNota = 0;

                try ( BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        String[] datos = linea.split(separador);
                        String nombre = datos[0];
                        double nota1 = Double.parseDouble(datos[1].replace(",", "."));
                        double nota2 = Double.parseDouble(datos[2].replace(",", "."));
                        double nota3 = Double.parseDouble(datos[3].replace(",", "."));
                        Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);
                        double notaFinal = alumno.calcularNotaFinal();
                        if (notaFinal >= 5) {
                            cantidadAprobados++;
                        }
                        if (notaFinal > mejorNota) {
                            mejorNota = notaFinal;
                            mejorAlumno = alumno;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo " + archivo);
                }

                System.out.println("Cantidad de alumnos con nota final >= 5: " + cantidadAprobados);
                System.out.println("Mejor alumno: " + mejorAlumno.getNombre() + " (nota final: " + mejorNota + ")");
            }
        }
    }
}
