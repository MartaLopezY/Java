/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.util.Scanner;
import static mlyt06._modeloMenu.teclado;

/**
 * 03/11/2022
 *
 * @author marta.lopezyanez A partir de la clase MovilPrepago del ejercicio3
 * anterior, crea un programa en el que el usuario dé de alta un telefono con
 * unas caracteristicas determinadas y luego le permita mediante un menu hacer
 * operaciones como consultar saldo,recarga,hacer llamada,navegar. Se
 * proporciona un modelo(modeloMenu a modo de esqueleto, con el menu y las
 * funciones necesarias, en las que solo tienes que rellenar los huecos)
 */
public class MLYt06e03 {

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente("ES34123412341258");

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion, i = 0;
        boolean ok;
        float pc= 0.02F;
        float mc= 0.01F;
        CuentaCorriente.setComision (pc, mc) ;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    System.out.print("Introduce el importe a ingresar: ");
                    float ing = teclado.nextFloat();
                    cc.ingresar(ing);
                    i++;
                    if (i == 3) {
                        cc.ingresar(0.7F);
                    }
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("Introduce el importe a retirar: ");
                    float ret = teclado.nextFloat();
                    ok = cc.retirar(ret);
                    if (ok == false) {
                        System.out.print("El importe a retirar es mayor que el saldo disponible");
                    }
                    i = 0;
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    
                    System.out.println("El saldo actual es: " + cc.getSaldo());
                }

                case 0 -> {
                    salir = true;
                }
                default -> {
                    System.out.println("Opción incorrecta");
                }
            }
        } while (!salir);

    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Ingresar");
        System.out.println("2 Retirar");
        System.out.println("3 Consultar saldo");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
