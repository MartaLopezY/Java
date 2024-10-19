/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt07A;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
 * momento. Hacer un programa con un menú que permita al usuario usar los
 * métodos creados. No hay que introducir a mano los valores de hora de entrada
 * y salida en el parking, se harán por el reloj del sistema.
 */
public class MLYt07Ae07 {

   static Parking2 p ;
   static Scanner teclado;

    public static void main(String[] args) {
     p= new Parking2();
        boolean salir = false;
        char opcion;
        teclado = new Scanner(System.in);

        do {

            System.out.println("\n\n----Gestion Parking LIFO----");
            System.out.println("a) Mostrar parking\nb) Aparcar\nc) Desaparcar\nd) Total recaudado\ne) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case 'a' ->
                    mostrarParking();
                case 'b' ->
                    aparcar();
                case 'c' ->
                    desaparcar();
                case 'd' ->
                    totalRecaudado();
                case 'e' ->
                    salir = true;
                default ->
                    System.out.println("Opcion invalida");
            }

        } while (salir == false);
    }

    private static void mostrarParking() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
        Coche[] arr;
        arr = p.mostrarParking();
        System.out.println("Estado del parking");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " :: " + arr[i].matricula + " :: " + formato.format(arr[i].horaLlegada));
        }

    }

    private static void aparcar() {
        System.out.println("Introduce matricula: ");
        String mat = teclado.nextLine();
        int res = p.aparcar(mat);
        if (res == -1) {
            System.out.println("Parking lleno");
        } else {
            System.out.println("Coche aparcado en plaza: " + res);
        }

    }

    private static void desaparcar() {
        Coche coche = p.desaparcar();
        if (coche == null) {
            System.out.println("Parking vacio");
      
        } else {
            System.out.println("Coche: " + coche.matricula + " desaparcado " + coche.importePagar + " euros");
        }

    }

    private static void totalRecaudado() {

        System.out.printf("%.2f euros recaudados", p.totalRecaudado());
    }

}
