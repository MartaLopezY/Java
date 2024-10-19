/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;



/**
 *
 * @author marta.lopezyanez 
 *  29/9/2022
 * Programa que muestra la tabla de multiplicar del 1 al 9
 */
public class MLYt03e18 {

    public static void main(String[] args) {
   

        int mult;
       for (int n = 1; n < 10; n++) {
            System.out.println("Su tabla de multiplicar de " + n + " es: ");
            for (int i = 1; i <= 10; i++) {
                mult = n * i;

                System.out.println(n + " x " + i + " = " + mult);

            }
        } 
        }
    
}
