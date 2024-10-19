/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

/**
 *
 * @author marta.lopezyanez 
 * 28/9/2022
 * Programa que determina si los números perfectos que
 * hay entre 1 y 10000. Un número perfecto si es igual a la suma de todos los
 * divisores menores que él.
 */
public class MLYt03e14 {

    public static void main(String[] args) {
        System.out.println("Los números perfectos entre 1 y 10000 son: ");

        for (int i = 1; i <= 10000; i++) {
            int suma = 0;
            for (int j = i/2; j >0; j--) {

                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                System.out.println(i);
            }
        }
    }
}
