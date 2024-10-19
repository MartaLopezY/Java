/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Scanner;




/**
 * 1/12/2022
 *
 * @author marta.lopezyanez Realizar una clase llamada Parking que gestione los coches aparcados en un parking mediante
un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y
caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir
(esta estructura se llama pila LIFO – Last Input, First Output ). Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la
información del parking correspondiente a los métodos creados 
 */
public class MLYt07Ae06 {

    public static void main(String[] args) {
  Parking parking=new Parking();
       Scanner teclado = new Scanner(System.in);
      int i=0;
     while(i<5){  
      System.out.println("Introduce la matricula del nuevo coche a aparcar: ");
      String mat1 = teclado.nextLine();
      int plaza=parking.aparcar(mat1);
      System.out.println("El número de la plaza para el coche introducido es: "+plaza);
      i++;
     }
      int numlibre=parking.libres();
        System.out.println("Las matriculas de los coches aparcado son: ");
          for (int j = 0; j < 20-numlibre; j++) {
            System.out.println( parking.getMatricula(j));

        }
    
       System.out.println("El número de plazas libres es: "+numlibre);
      System.out.println("La matricula del coche a desaparcar es: "+parking.desaparcar());

       
      
    }
    
    
}

