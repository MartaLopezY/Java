/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Random;

/**
 * 24/11/2022
 *
 * @author marta.lopezyanez Realiza un programa que tenga definido un Array como
 * variable global llamado temperaturaMeses, de 12 enteros, con las temperaturas
 * medias de un lugar en cada uno de los meses del año. Serán valores enteros
 * negativos o positivos. El programa tendrá diferentes funciones que realicen
 * las siguientes tareas:
 */
public class MLYt07Ae01 {

    public static void main(String[] args) {
        // a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);
        }
        // b) Mostrar por pantalla el contenido del Array.
         System.out.println("Temperatura por orden de meses:");
        for (int temperatura:temperaturaMeses){
        
        System.out.println(temperatura);
        
        }      
        // c)Mostrar por pantalla el contenido del Array en orden inverso.
          System.out.println("Temperatura por orden inverso de meses:");
        for (int i =  (temperaturaMeses.length)-1; i >=0 ; i--) {
             System.out.println(temperaturaMeses[i]);
        }
    }

}
