/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt03;

/**
 *
 * @author marta.lopezyanez 29/9/2022 Programa que quiere mostrar la serie de
 * Fibonacci La serie de Fibonacci se compone a partir de números naturales,
 * empezando por 0 y 1, y construyendo cada nuevo número de la serie como la
 * suma de los dos anteriores
 *
 * public class Ejercicios { public static void main(String[] args) { int ant=1,
 * ant2=0, num; for (int i=1; i<=12; i++){ num = ant + ant2;
 * System.out.println(num); ant = num; ant2 = ant; } } }
 */
public class MLYt03e21 {

    public static void main(String[] args) {
        int ant = 1, ant2 = 0, num;
        for (int i = 1; i <= 12; i++) {
            num = ant + ant2;
            System.out.println(num);
            ant2 = ant;
            ant = num;
        }
    }
}
// En el programa original la asignación esta al revés y estaria guardando el mismo número dos veces de manera que el siguiente seria el doble del anterior
