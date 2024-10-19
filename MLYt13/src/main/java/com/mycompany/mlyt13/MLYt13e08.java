/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt13;

import java.util.Scanner;

/**
 * 10/2/2023
 *
 * @author marta.lopezyanez. Realiza una función/método que se le pase por
 * parámetro una cadena que representa una dirección de correo electrónico. En
 * caso de que la cadena no cumpla las condiciones sintácticas de un email, se
 * generará una excepción de tipo: “Formato email inválido”. Los requisitos que
 * tiene que tener una dirección de email podrían ser: número mínimo de
 * caracteres=5, una arroba y al menos un punto después de la arroba. Hacer
 * también un programa que llame a la función anterior y capture la excepción
 * generada.
 */
public class MLYt13e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un email: ");
        String correo = teclado.nextLine();
        try {
            validarMail(correo);
        } catch (ExcepcionCad e) {
            
            System.out.println(e.getMessage());
        }     }

    public static void validarMail(String correo) throws ExcepcionCad {
        
       if(correo.length()>=5 && correo.indexOf('@')!=-1) {
       
           throw new ExcepcionCad();
        }

    }
 static class   ExcepcionCad extends Exception{
  @Override
  public String getMessage(){
return "Error: Correo inválido";
  }

}
}
