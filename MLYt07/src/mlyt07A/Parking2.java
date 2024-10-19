/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 8/12/2022
 *
 * @author marta.lopezyanez Realizar una clase llamada Parking2 que gestione los
 * coches aparcados en un parking mediante un Array, que almacene las matrículas
 * y la hora de entrada en el parking. El parking es un poco raro, mide solo 3
 * metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
 * último en entrar debe ser el primero en salir (esta estructura se llama pila
 * LIFO – Last Input, First Output). Cada minuto en el parking cuesta 2 céntimos
 * (máx 10 euros). La clase debe tener métodos siguientes: • Mostrar el estado
 * del parking, esto es las matrículas/hora de entrada de las plazas ocupadas. •
 * Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero
 * si lleno. La plaza del fondo es la número 1 y la que está más cerca de la
 * entrada es la 20. • Desaparcar: (¿hace falta pasarle algún parámetro?). Al
 * desaparcar se calcula el importe a pagar según los segundos de estancia.
 * Devuelve la matrícula del coche y el importe a pagar. Si es parking está
 * vacío devuelve cadena vacía y cero euros. • Mostrar lo recaudado hasta ese
 * momento.
 */
public class Parking2 {

    private final Coche[] plazas;
    public int ocupada;
    private static final int maxPlazas = 20;
    private double totalRecaudado;

    Parking2() {
        plazas = new Coche[maxPlazas];
        ocupada = 0;
        totalRecaudado = 0;
    }

    public int aparcar(String mat) {
        int plaza;
        if (ocupada == 20) {
            plaza = 0;
        } else {
            this.plazas[ocupada] = new Coche(mat);
            plaza = ocupada;
        }

        return plaza;
    }

    public Coche desaparcar() {
        long tiempo;
        double aPagar;
        if (ocupada == 0) {
            return null;
        }
        this.ocupada--;
        tiempo = ChronoUnit.MINUTES.between(this.plazas[ocupada].horaLlegada, LocalDateTime.now());
        aPagar = tiempo * 0.02;
        if (aPagar > 30) {
            aPagar = 30;
        }
        this.plazas[this.ocupada].importePagar = aPagar;
        totalRecaudado += aPagar;
        return this.plazas[this.ocupada];
    }

    public int desaparcarImporte() {
        int coste = 0;
        return coste;
    }

    public Coche[] mostrarParking() {
        Coche p[] = new Coche[this.ocupada];
        System.arraycopy(this.plazas, 0, p, 0, this.ocupada);
        return p;
    }

    public double totalRecaudado() {

        return totalRecaudado;
    }
}
