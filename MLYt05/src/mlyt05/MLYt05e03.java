/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

import java.util.Scanner;

/**
 *25/10/2022
 * @author marta.lopezyanez Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes
y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar
un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero
de ese año (no usar clases Java de fechas).
 */
public class MLYt05e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, año;
        do{
        System.out.println("Introduzca el mes: ");
        mes = teclado.nextInt();}while(mes<1 || mes>12);
        System.out.println("Introduzca el año: ");
        año = teclado.nextInt();

        int DiasMes = CalcularDiasMes(año, mes);
        System.out.println("Los dias que tiene ese mes son: " + DiasMes);
        System.out.println("Introduzca el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduzca el año: ");
        año = teclado.nextInt();
        int DiasPasados = dia;
        for (int i = 1; i < mes; i++) {
            DiasMes = CalcularDiasMes(año,i);
            DiasPasados = DiasPasados + DiasMes;
        }
        System.out.println("Los dias que pasaron desde el 1 de enero son: " + DiasPasados);
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

    }

