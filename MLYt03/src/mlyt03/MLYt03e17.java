/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez 29/09/2022 Programa que al que se le introduce las
 * notas de un alumno en los nueve módulos de un ciclo y nos informa si puede ir
 * a la FCT (todos aprobados).
 */
public class MLYt03e17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean fct = true;
        int i = 1;
        while (i < 10) {
            int nota;
            System.out.println("Introduce la nota de módulo " + i);
            nota = teclado.nextInt();
            if (nota >= 5) {
                fct = true;
            } else {
                fct = false;
                break;  //Si uno de los módulos esta suspenso no puede ir y no tengo que seguir comprobando
            }
            i++;

        }
        if (fct) {
            System.out.println("Puede ir a la FCT");
        } else {
            System.out.println("No puede ir a la FCT");
    
        }
    }

}
