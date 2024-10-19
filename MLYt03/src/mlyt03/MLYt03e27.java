/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 
 * 6/10/2022 
 * Programa que suma los dígitos de los números múltiplos de tres y comprueba que también un múltiplo de tres para los primeros 10000

 */
public class MLYt03e27 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, suma;
        System.out.println("Los números entre 1 y 10000 divisores de 3 son:");
for(int i=1;i<=10000;i++)
        
    {
     num=i;  
     suma=0;
           while (num>10){
           
               suma=suma+(num%10);
               num=num/10;
           }
             suma=suma+num;
       if(suma%3==0)
            System.out.println(i);
    }

    }

}
