/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mlyt05;


/**
 *
 * @author marta.lopezyanez 26/10/2022 El siguiente programa tiene una variable
 * global llamada saldo sobre la que se ejecutan las funciones ingresar() y
 * retirar() que aumentan y reducen el saldo respectivamente, no pudiendo quedar
 * el saldo por debajo de cero. ¿Hay algún error? ¿Cuánto vale la variable saldo
 * al finalizar la ejecución del programa?
 */
public class MLYt05e09 {

    public static int saldo = 0;

    public static void main(String[] args) {
        boolean ok = false;
        ingresar(30);
//Aqui llama a ingresar y me suma 30 al saldo pero solo lo hace dentro de la función no me devuelve nada
        retirar(10);
        /*Aqui llama a retirar pero no lo recoge en ninguna variable y le resta 10 a 30, queda 20 de saldo*/

      if (retirar(10) == false) {    //Aqui llama a retirar otra vez y vuelva a restarle 10 al saldo, queda 10 de saldo 
            System.out.println("No se puede retirar tanto");
        }
        System.out.println("Saldo final: " + saldo);
//El saldo final es 10 porque hemos llamado dos veces a retirar, solo tendriamos que llamar a retirar en el if 
    }

    static void ingresar(int i) {
        saldo += i;
    }

    static boolean retirar(int i) {
        if (i > saldo) {
            return false;
        }
        saldo -= i;
        return true;
    }
}
