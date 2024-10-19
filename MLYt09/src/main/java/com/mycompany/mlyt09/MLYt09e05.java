/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt09;

import java.util.Scanner;

/**
 * 23/01/2023
 *
 * @author marta.lopezyanez Empleando las clases previas: MovilPrepago,
 * MovilTarifaPlana, MovilPlus, realizar un programa que inicialmente permita
 * seleccionar al usuario qué tipo de tarifa tiene entre las tres posibles,
 * luego configurará el móvil solicitando al usuario los parámetros necesarios y
 * finalmente presentará al usuario un menú para realizar las operaciones
 * permitidas (navegar, llamar, recargar, videollamar, ver saldo y salir) según
 * el tipo de tarifa.
 */
public class MLYt09e05 {

    public static void main(String[] args) {

        MovilPrepago telefono = new MovilPrepago();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        System.out.println("\n\n\n");
        System.out.println("Elija una tarifa:");
        System.out.println("1 Movil Prepago");
        System.out.println("2 Movil Plus");
        System.out.println("3 Movil Tarifa Plana");

        int tarifa = teclado.nextInt();
        System.out.println("Introduce el numero de movil: ");
        long num = Long.parseLong(teclado.nextLine());
        System.out.println("Introduce el coste de establecimiento de llamada: ");
        float cEL = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduce el coste por minuto de llamada: ");
        float cML = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduce el saldo: ");
        float sal = Float.parseFloat(teclado.nextLine());

        switch (tarifa) {

            case 1 -> {

                System.out.println("Introduce el coste por consumo de megas: ");
                float cCM = Float.parseFloat(teclado.nextLine());
                telefono = new MovilPrepago(num, cEL, cML, cCM, sal);

            }
            case 2 -> {
                System.out.println("Introduce el coste por consumo de megas: ");
                float cCM = Float.parseFloat(teclado.nextLine());
                telefono = new MovilPlus(num, cEL, cML, cCM, sal);

            }
            case 3 -> {

                telefono = new MovilTarifaPlana(num, cEL, cML, sal);
            }
            default ->
                System.out.println("Opción incorrecta");
        }

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    telefono.toString();

                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("Introduce el importe a recargar: ");
                    int n = teclado.nextInt();
                    System.out.print("Movil Prepago: ");
                    telefono.recargar(n);

                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    System.out.print("Introduce los segundos de la llamada: ");
                    int seg = teclado.nextInt();
                    if (telefono instanceof MovilPlus movilPlus) {
                        movilPlus.efectuarLlamada(seg);
                    } else {
                        telefono.efectuarLlamada(seg);
                    }
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    System.out.print("Introduce los MB usados: ");
                    int mb = teclado.nextInt();
                    if (telefono instanceof MovilPlus movilPlus) {
                        movilPlus.navegar(mb);
                    } else if (telefono instanceof MovilTarifaPlana movilTarifaPlana) {
                        movilTarifaPlana.navegar(mb);
                    } else {
                        telefono.navegar(mb);
                    }

                }
                case 5 -> {
                    System.out.println("\tElegiste opción 5");
                    if (telefono instanceof MovilPlus == false) {
                        System.out.print("Opción invalida");
                    } else {
                        System.out.print("Introduce los segundos de la videollamada: ");
                        int sg = teclado.nextInt();

                        ((MovilPlus) telefono).videollamada(sg);
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
        System.out.println("1 Consultar saldo");
        System.out.println("2 Recargar saldo");
        System.out.println("3 Hacer llamada");
        System.out.println("4 Navegar");
        System.out.println("5 Hacer videollamada");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
