/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

/**
 *
 * @author marta.lopezyanez 29/9/2022 
 * Programa que muestra los número primos comprendidos entre 2 y 1000
 *
 */
public class MLYt03e20 {

    public static void main(String[] args) {

        boolean primo = true;

        for (int i = 2; i <= 1000; i++) {
            if (i == 2) {
                primo = true;
            } else {
                if (i % 2 == 0) {
                    primo = false;
                } else {
                    for (int j = 2; j <= i / 2; j++) {
                        if ((i % j )!= 0) {
                            primo = true;
                        } else {
                            primo = false; break;
                        }
                    }

                }
            }
            if (primo == true) {
                System.out.println(i);
            }
        }
    }
}
