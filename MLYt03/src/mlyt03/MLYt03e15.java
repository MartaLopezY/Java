/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

/**
 *
 * @author marta.lopezyanez 29/09/2022 Sin ejecutarlo, intenta explicar que hace
 * este programa.
 */
public class MLYt03e15 {

    public static void main(String[] args) {
        int hora = 0;
        for (int i = 1; i <= 7 * 24; i++) {   //El programa cuenta las horas del dia los 7 dias de la semana*/
            System.out.println(hora);
            if (++hora > 23) {       //Cuando llega a las 23h reinicia la variable hora pero no tiene ninguna variable que recoja el dia de la semana
                hora = 0;
            }
        }
    } //fin main
} //fin clase

