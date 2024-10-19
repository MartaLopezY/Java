/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

import java.util.Scanner;


/**
 *25/10/2022
 * @author marta.lopezyanez Partiendo de la función del programa anterior, hacer
 * un programa al que se le introduzcan dos fechas del mismo año y nos informe
 * de los días comprendidos entre ellas (no usar clases Java de fechas)
 */
public class MLYt05e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia1, mes1, año1, dia2, mes2, año2;

        System.out.println("Introduzca el dia de la primera fecha: ");
        dia1 = teclado.nextInt();
        System.out.println("Introduzca el mes de la primera fecha: ");
        mes1 = teclado.nextInt();
        System.out.println("Introduzca el año de la primera fecha: ");
        año1 = teclado.nextInt();
        System.out.println("Introduzca el dia de la segunda fecha: ");
        dia2 = teclado.nextInt();
        System.out.println("Introduzca el mes de la segunda fecha: ");
        mes2 = teclado.nextInt();
        System.out.println("Introduzca el año de la segunda fecha: ");
        año2 = teclado.nextInt();
   int dias1=DiasPasados(año1,mes1,dia1);
   int dias2=DiasPasados(año2,mes2,dia2);
    System.out.println("Los dias que pasaron entre las dos fechas son: " + (dias2-dias1));
    }

    public static boolean bisiesto(int año) {
        if (año % 4 == 0 && año % 100 != 0) {

            return true;
        } else {
            if (año % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int CalcularDiasMes(int año, int mes) {

       switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (bisiesto(año)) return 29;
                 return 28;
                }
            default -> {
                return 30;
            }
            }
           

    }

    public static int DiasPasados(int año, int mes, int dia) {
        int DiasPasados = dia;
        for (int i = 1; i < mes; i++) {
             DiasPasados = DiasPasados + CalcularDiasMes(año, i);
            
        }
        return DiasPasados;
    }
}
