/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mlyt14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**26/2/2023
 *
 * @author marta.lopezyanez. Realizar un programa que inserte en un ArrayList 5 elementos de tipo MovilPrepago pero solo
solicitando al usuario el número de móvil, ya que el resto de parámetros los tomará del fichero
obtenido en el ejercicio anterior. Finalmente mostrará el contenido del ArrayList para comprobar
que se han leído los datos correctamente.
 */
public class MLYt14e19 {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList <MovilPrepago> moviles = new ArrayList <> ();
        
        float costeEstablecimientoLlamada = 0;
        float costeConsumoDatos = 0;
        float costeMinutoLlamada = 0;
        
        Properties config = new Properties();
        try {
         config.load(new FileInputStream("archivos"+System.getProperty("file.separator")+"config.props"));
         costeEstablecimientoLlamada = Float.parseFloat(config.getProperty("CosteEstablecimientoLlamada"));
         costeConsumoDatos = Float.parseFloat(config.getProperty("CosteConsumoDatos"));
         costeMinutoLlamada = Float.parseFloat(config.getProperty("CosteMinutoLlamada"));
        } catch (IOException ioe) {ioe.printStackTrace();}
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduce el número del móvil "+i+": ");
            long numeroMovil = teclado.nextLong();
            
            moviles.add(new MovilPrepago(numeroMovil, costeEstablecimientoLlamada, costeMinutoLlamada, costeConsumoDatos, 0));
        }
        
        for(MovilPrepago movil : moviles){
            System.out.println(movil.toString());
        }
    }      
}
