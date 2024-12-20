/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 26/1/2023
 *
 * @author marta.lopezyanezHaz un programa con un menú que permita gestionar un
 * parking. • El parking tiene 100 plazas y pueden aparcar cualquier tipo de 3
 * tipos de vehículos distintos: Vehículos en general, Furgonetas y Autobuses. •
 * Todos los vehículos pagan 4 céntimos por minuto, pero las furgonetas pagan
 * además un suplemento de 20 céntimos por cada metro de su longitud y los
 * autobuses pagan un suplemento de 25 céntimos por asiento. • El menú del
 * programa deberá permitir: a) Entrada de un vehículo. Se le pide al usuario la
 * matrícula, tipo de vehículo y datos adicionales para el cálculo de la
 * estancia (longitud, número de asientos…). b) Salida del vehículo. Se le pide
 * al usuario la matrícula, se calcula el importe a pagar y libera la plaza. c)
 * Mostrar la lista de vehículos en el parking con la matrícula, tipo de
 * vehículo y fecha/hora de llegada (piensa en el método toString). Al final
 * número total de plazas ocupadas. d) Salir • Puedes hacer coste 4 céntimos por
 * segundo (en vez de por minuto) para probarlo. • No hay el concepto de número
 * de plaza, los coches van aparcando donde quieren. • Mantén la mayor cantidad
 * de información (datos y cálculos) en las clases, no en el programa. Puedes
 * crear las clases en el mismo archivo que el programa (por comodidad) con el
 * modificador de acceso por defecto. • El parking será un ArrayList. Para
 * localizar un vehículo (en la opción de menú de Salida del vehículo) emplea
 * ArrayList.indexOf y ello te puede implicar definir equals en alguna clase.
 */
public class MLYt09e10 {

    public static ArrayList<Vehiculo> parking = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    entrada();
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.println("Introduce la matricula: ");
                    String mat = teclado.nextLine();
                    int posicion=parking.indexOf(mat);
                    if (posicion == -1) {
                        System.out.println("Matricula no encontrada");
                    } else {
                        parking.get(posicion).salida();            
                        parking.remove(posicion);
                    }
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    for (Vehiculo p : parking) {
                        p.toString();
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
        System.out.println("1 Entrada vehículo");
        System.out.println("2 Salida vehículo.");
        System.out.println("3 Lista de vehículos");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    public static void entrada() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la matricula: ");
        String mat = teclado.nextLine();

        System.out.println("Introduce el tipo de vehiculo: ");
        System.out.println("1 General");
        System.out.println("2 Furgoneta");
        System.out.println("3 Autobús");
        int tipo = Integer.parseInt(teclado.nextLine());
        switch (tipo) {
            case 1 ->
                parking.add(new Vehiculo(mat));
            case 2 -> {
                System.out.println("Introduce la longitud del vehiculo");
                int longitud = Integer.parseInt(teclado.nextLine());
                parking.add(new Furgoneta(mat, longitud));
            }
            case 3 -> {
                System.out.println("Introduce el número de asientos");
                int numAsientos = Integer.parseInt(teclado.nextLine());
                parking.add(new Autobus(mat, numAsientos));
            }
            default -> {
                System.out.println("Opción incorrecta");
            }
        }

    }

}
