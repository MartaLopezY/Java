/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/* 24/10/2022
 *
 * @author marta.lopezyanez
Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a
dichas funciones:Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma
de los números comprendidos entre los números pasados (el primero es menor que el
segundo, y ambos mayores que cero, en caso contrario devuelve -1)
 */
public class MLYt05e01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1, num2, resultado;
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce un número entero: ");
        num2 = teclado.nextInt();
     
        resultado = sumaIntervalo(num1, num2);
         if (resultado == -1) {
            System.out.println("Los numeros introducidos son incorrectos");
        } else {
            System.out.println("La suma comprendida es:" + resultado);
        }
        

    }

    public static long sumaIntervalo(long num1, long num2) {
        
        long resultado=0;
        if (num1 > num2 || num1 <0 || num2 <0) {
            return -1;
      
        } else{
        for(long i=num1;i<num2;i++){
        
        resultado=resultado+i;
        }
        return resultado;
        
        }

    }

}
