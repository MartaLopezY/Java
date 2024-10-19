/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**26/2/2023
 *
 * @author marta.lopezyanez. Realizar un programa que solicite al usuario tres valores: el coste de establecimiento de
llamada de los móviles de prepago, el coste por MB de consumo de datos y el coste por minuto de
llamada. A continuación, se construirá un fichero de tipo Properties con los parámetros introducidos.
 */
public class MLYt14e18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Introduce el coste de establecimiento de llamada: ");
        float CosteEstablecimientoLlamada = teclado.nextFloat();
        
        System.out.println("Introduce el coste por MB de consumo de datos: ");
        float costeConsumoDatos = teclado.nextFloat();

        System.out.println("Introduce el coste por minuto de llamada: ");
        float costeMinutoLlamada = teclado.nextFloat();

        Properties config = new Properties();
        config.setProperty("CosteEstablecimientoLlamada", String.valueOf(CosteEstablecimientoLlamada));
        config.setProperty("CosteConsumoDatos", String.valueOf(costeConsumoDatos));
        config.setProperty("CosteMinutoLlamada", String.valueOf(costeMinutoLlamada));
        try {config.store(new FileOutputStream("archivos"+System.getProperty("file.separator")+"config.props"),"Fichero de config.");}
        catch (IOException ioe) {ioe.printStackTrace();}
    }    
}
