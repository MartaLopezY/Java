/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 9/2/2023
 *
 * @author marta.lopezyanez Añade el sufijo _v2 a las clases de capítulos previos: movilPrepago, movilTarifaPlana,
movilPlus y crea una interfaz llamada PrePagable que estas clases deberían implementar. Incluye en
la interfaz todos los métodos que creas oportuno y, si es necesario, alguno puede ser método por
defecto.
 */
public class MLYt10e12 {

    public static void main(String[] args) {

       
        ArrayList<PrePagable> telefonos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        System.out.println("\n\n\n");
       do{
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
                telefonos.add(new MovilPrepago_v2(num, cEL, cML, cCM, sal));

            }
            case 2 -> {
                System.out.println("Introduce el coste por consumo de megas: ");
                float cCM = Float.parseFloat(teclado.nextLine());
                telefonos.add(new MovilPlus_v2(num, cEL, cML, cCM, sal));

            }
            case 3 -> {

                telefonos.add(new MovilTarifaPlana_v2(num, cEL, cML, sal));
            }
            default ->
                System.out.println("Opción incorrecta");
        }
       }while(telefonos.size()<5);
        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    telefonos.get(seleccionarTelefono()).toString();

                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("Introduce el importe a recargar: ");
                    int n = teclado.nextInt();
                    System.out.print("Movil Prepago: ");
                    telefonos.get(seleccionarTelefono()).recargar(n);

                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    System.out.print("Introduce los segundos de la llamada: ");
                    int seg = teclado.nextInt();
                    if (telefonos.get(seleccionarTelefono()) instanceof MovilPlus_v2 movilPlus) {
                        movilPlus.efectuarLlamada(seg);
                    } else {
                        telefonos.get(seleccionarTelefono()).efectuarLlamada(seg);
                    }
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    System.out.print("Introduce los MB usados: ");
                    int mb = teclado.nextInt();
                    if (telefonos.get(seleccionarTelefono()) instanceof MovilPlus_v2 movilPlus) {
                        movilPlus.navegar(mb);
                    } else if (telefonos.get(seleccionarTelefono()) instanceof MovilTarifaPlana_v2 movilTarifaPlana) {
                        movilTarifaPlana.navegar(mb);
                    } else {
                       ((MovilPrepago_v2)telefonos.get(seleccionarTelefono())).navegar(mb);
                    }

                }
                case 5 -> {
                    System.out.println("\tElegiste opción 5");
                    if (telefonos.get(seleccionarTelefono()) instanceof MovilPlus_v2 == false) {
                        System.out.print("Opción invalida");
                    } else {
                        System.out.print("Introduce los segundos de la videollamada: ");
                        int sg = teclado.nextInt();

                        ((MovilPlus_v2) telefonos.get(seleccionarTelefono())).videollamada(sg);
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
     private static int seleccionarTelefono() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.println("Elija el telefono con el que desea realizar esta opción:");
        System.out.println("1 Telefono 1");
        System.out.println("2 Telefono 2");
        System.out.println("3 Telefono 3");
        System.out.println("4 Telefono 4");
        System.out.println("5 Telefono 5");
       
            return (Integer.parseInt(teclado.nextLine())-1);
       
    }
}
