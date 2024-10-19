/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * 16/02/2023
 *
 * @author marta.lopezyanez. Haz una versión del ejercicio anterior que lea
 * todas las líneas en una sola operación de lectura.
 */
public class MLYt14e05 {

    public static void main(String[] args) {

        try {
            Path path = Paths.get("archivos" + File.separator + "fich02.txt");
            List<String> lineas = Files.readAllLines(path);
            System.out.println(lineas);
        } catch (IOException ex) {
            System.err.printf("Err:%s\n", ex.getMessage());
        }
    }
}
