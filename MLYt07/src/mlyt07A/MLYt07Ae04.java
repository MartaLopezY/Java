/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.util.Arrays;
import java.util.Random;

/**
 * 25/11/2022
 *
 * @author marta.lopezyanez Realiza un programa similar a los anteriores pero
 * que realice las siguientes funciones: a. Llenar el Array con valores al azar
 * para todos los meses. Para enero, febrero, marzo, noviembre y diciembre los
 * valores estarán comprendidos entre -10 y +20 y para el resto de meses entre
 * +10 y +40. c. Mostrar la temperatura máxima del año, usando printf
 * especificando en el formato que incluya el signo “+” en temperaturas
 * positivas y que solo muestre 1 decimal. d. Mostrar el nombre del mes más frío
 * del año. e. Para hacer pruebas estadísticas, desplazar los valores a la
 * derecha, pasando el último al primero.
 *
 */
public class MLYt07Ae04 {

    public static void main(String[] args) {

        float temperaturaMeses[] = new float[12];
        float tempMax = 10;

        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i < 3 || i > (temperaturaMeses.length) - 2) {
                temperaturaMeses[i] = frio();
            } else {
                temperaturaMeses[i] = calor();
                if (temperaturaMeses[i] > tempMax) {
                    tempMax = temperaturaMeses[i];
                }
            }
        }

        System.out.printf("La temperatura maxima del año fue: %+.1f", tempMax);
        System.out.println(" ");
        int mFrio = masFrio(temperaturaMeses);
        System.out.println("El mes más frio ha sido: " + (mFrio + 1));
        System.out.println("Temperatura después del desplazamiento:" + Arrays.toString(desplazar(temperaturaMeses)));
    }

    public static float frio() {
        float temp;
        Random r = new Random();
        temp = r.nextFloat(31) - 10;
        return temp;
    }

    public static float calor() {
        float temp;
        Random r = new Random();
        temp = r.nextFloat(41) + 11;
        return temp;
    }

    public static int masFrio(float[] temperatura) {
        float minima = 21;
        int posicion = 0;
        for (int i = 0; i < temperatura.length; i++) {

            if (temperatura[i] < minima) {
                minima = temperatura[i];
                posicion = i;
            }

        }

        return posicion;
    }

    public static float[] desplazar(float[] temperatura) {
        int longitud = temperatura.length;
        float aux = temperatura[0];
        temperatura[0] = temperatura[longitud - 1];

        for (int i = longitud - 1; i > 0; i--) {

            if (i == 1) {
                temperatura[i] = aux;
            } else {
                temperatura[i] = temperatura[i - 1];
            }
        }

        return temperatura;
    }

}
