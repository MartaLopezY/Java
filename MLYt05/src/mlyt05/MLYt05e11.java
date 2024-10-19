/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;

/**
 *
 * @author marta.lopezyanez 26/10/2022 Este código es erróneo ¿Qué mostraría por
 * pantalla? ¿Por qué?
 */
public class MLYt05e11 {

    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        /*Aqui deberia aumentar el valor del saldo en 600(1100) pero como ingresar no me devuelve nada no modifica la variable saldo 
        saldo sigue siendo 500*/
        if (saldo > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static void ingresar(float saldo, float increm) {
        saldo += increm;
        // faltaria poner return saldo; para que programa funcione bien y la funcion deberia ser de tipo float y no void
    }
}
