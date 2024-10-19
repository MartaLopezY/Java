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
public class MLYt05e10 {

    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        //Aqui incrementa el valor del saldo hasta 900 (500+400)
        if (ingresar(saldo, 400f) > 1000f) {   
            /*Aqui mira si incrementando otros 400 es mayor a 1000, pero lo hace partiendo de que saldo es 900 y aumentariamos otros 400 mas, es decir, 1300(900+400)
             pero saldo sigue siendo 900. Para que lo compruebe bien deberiamos poner if (saldo > 1000f)*/
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }
}
