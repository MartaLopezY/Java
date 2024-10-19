/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6/2/2023
 *
 * @author marta.lopezyanez Se desea hacer la gestión de las habitaciones de un
 * hotel. Todas las habitaciones tienen un número de habitación y un proceso de
 * check-in y check-out. En el hotel hay tres tipos de habitaciones, aunque
 * podría haber más en el futuro:  3 habitaciones Lowcost (cuesta 50 euros/dia
 * todo el año).  10 habitaciones dobles. Tienen una tarifa normal de 100
 * euros/dia y un incremento del 20% si el día de salida es abril, julio o
 * agosto.  5 habitaciones Suite. 200 euros/día con 20% de descuento para
 * estancias de 10 o más días. • El programa inicialmente meterá las 18
 * habitaciones en un ArrayList y las marcará como “no ocupadas”. • El programa
 * tendrá un menú para hacer check-in entre las habitaciones libres, check-out
 * entre las ocupadas y listar habitaciones libres y ocupadas. • El check-in es
 * común para todas las habitaciones, consiste en marcar la habitación como
 * ocupada. El check-out consiste en marcar la habitación como libre y calcular
 * el importe a pagar que se calculará en función del tipo de habitación y de
 * los días de estancia (quizás sea necesario almacenar la fecha de llegada en
 * el momento del check-in) Cuestión 1: ¿Habitacion debería ser una clase
 * abstracta o una interfaz? ¿Por qué? Cuestión 2: ¿Es útil que el método
 * toString() en la clase Habitacion? - Mantener toda la información en las
 * clases más que en el programa que las utiliza. - Puedes crear una clase
 * Hotel, que tendrá un ArrayList de Habitaciones, o bien definir ese ArrayList
 * en el programa como variable global y no tener la clase Hotel. - Sugerencia:
 * Para probar el programa, al hacer el check-out, puedes considerar cada día
 * como un segundo, así, si han pasado 3 segundos, considerar 3 días.
 */
public class MLYt10e13 {

    public static ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        float importe = 0;
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    System.out.println("Selecciona el numero de habitacion: 1->18");
                    int numero = Integer.parseInt(teclado.nextLine());
                    habitaciones.get(numero - 1).checkIn();
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.println("Selecciona el numero de habitacion: 1->18");
                    int numero = Integer.parseInt(teclado.nextLine());
                    importe = habitaciones.get(numero - 1).checkOut();
                    System.out.println("El importe a pagar es: " + importe);
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    System.out.println("Las habitaciones ocupadas son:");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        if (habitaciones.get(i).ocupada) {
                            System.out.println("La habitacion" + (i + 1) + " esta ocupada");
                        } else {
                            System.out.println("La habitacion" + (i + 1) + " esta libre");               
                        }
                    }
                }
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Hacer check-in");
        System.out.println("2 Hacer check-out");
        System.out.println("3 Consultar habitaciones disponibles");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

}
