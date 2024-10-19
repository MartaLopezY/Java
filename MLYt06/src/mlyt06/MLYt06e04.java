/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.util.Scanner;
import static mlyt06._modeloMenu.teclado;

/**
 * 14/11/2022
 *
 * @author marta.lopezyanez Haz un programa como el anterior, pero creando dos
 * cuentas en vez de una. Habrá una opción de menú nueva que será “Cambiar
 * cuenta activa” para pasar de una cuenta a otra. Tendremos una variable de
 * tipo CuentaCorriente que le puedes llamar cuentaActiva que unas veces
 * apuntará a una cuenta y otras veces a la otra Recuerda que las variables de
 * tipo Objeto, a diferencia de los tipos primitivos, son apuntadores a los
 * objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su
 * constructor, podemos hacer luego una tercera variable ‘cuentaActiva’ sin
 * constructor y hacer ‘cuentaActiva=cuenta1’ o bien ‘cuentaActiva=cuenta2’
 * cuando nos interese.
 */
public class MLYt06e04 {

    public static void main(String[] args) {

        CuentaCorriente cc1 = new CuentaCorriente("ES34123412341258");
        CuentaCorriente cc2 = new CuentaCorriente("ES34125823497820");
        CuentaCorriente cuentaActiva = cc1;
        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion, i = 0;
        boolean ok;
        float pc = 0.02F;
        float mc = 0.01F;
        CuentaCorriente.setComision(pc, mc);
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    System.out.print("Introduce el importe a ingresar: ");
                    float ing = teclado.nextFloat();
                    cuentaActiva.ingresar(ing);
                    i++;
                    if (i == 3) {
                        cuentaActiva.ingresar(0.7F);
                    }
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("Introduce el importe a retirar: ");
                    float ret = teclado.nextFloat();
                    ok = cuentaActiva.retirar(ret);
                    if (ok == false) {
                        System.out.print("El importe a retirar es mayor que el saldo disponible");
                    }
                    i = 0;
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");

                    System.out.println("El saldo actual es: " + cuentaActiva.getSaldo());
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    System.out.println("Introduce la cuenta a utilizar '1' o '2': ");
                    int num = teclado.nextInt();
                    switch (num) {
                        case 1 ->
                            cuentaActiva = cc1;
                        case 2 ->
                            cuentaActiva = cc2;
                        default ->
                            System.out.println("Opción incorrecta");
                    }
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
        System.out.println("4 Cambiar cuenta activa");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
