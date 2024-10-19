/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

/**
 * 30/11/2022
 *
 * @author marta.lopezyanez Realizar una clase llamada Parking que gestione los
 * coches aparcados en un parking mediante un Array que almacene las matrículas.
 * El parking es un poco raro, mide solo 3 metros de ancho y caben 20 coches,
 * pero uno detrás de otro por lo que el último en entrar debe ser el primero en
 * salir (esta estructura se llama pila LIFO – Last Input, First Output ). La
 * clase debe tener métodos siguientes: a. Mostrar el estado del parking, esto
 * es las matrículas de las plazas ocupadas. b. Aparcar: se le pasará el número
 * de matrícula. Devuelve número de plaza o cero si lleno. La plaza del fondo es
 * la número 1 y la que está más cerca de la entrada es la 20. c. Desaparcar:
 * (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a
 * desaparcar o bien una cadena vacía si el parking está vacío. d. Mostrar la
 * cantidad de plazas libres en ese momento.
 */
public class Parking {

    private static final String[] matricula = new String[20];
    public static int ocupada = 0;

    public String getMatricula(int i) {

        return matricula[i];
    }

    public void setMatricula(String m) {
        matricula[ocupada + 1] = m;
    }

    public int aparcar(String mat) {
        int plaza;
        if (ocupada == 20) {
            plaza = 0;
        } else {
            ocupada++;
            plaza = ocupada;
            setMatricula(mat);
        }

        return plaza;
    }

    public String desaparcar() {
        if (ocupada == 0) {
            return " ";
        }
        ocupada--;
        return matricula[ocupada];
    }

   

    public int libres() {
        int lib = 20 - ocupada;
        return lib;
    }
}
