/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author marta.lopezyanez 29/09/2022 
 * Programa que genera un numero aleatorio y el usuario debe adivinarlo en cinco intentos
 */
public class MLYt03e16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r=new Random();
        int num2=-1;
        
        int num1 = r.nextInt(100)+1;  //genera un número aleatrorio de 0 a 99
        
       int i=0;
       while(i < 5) {
           
            System.out.println("Introduce un número de 0 a 99");
            num2 = teclado.nextInt();
            if (num2 < num1) {
                System.out.println("El número es mayor");
            }

            if (num2 > num1) {
                System.out.println("El número es menor");
            }
            if (num2 == num1) {
                System.out.println("El número es ese");
                break;
            }
            i++;
                    
        }
    }

}
