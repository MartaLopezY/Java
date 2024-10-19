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
 * @author marta.lopezyanez 
 *A partir de la clase CuentaCorriente que te proporcionará el profesor, crea un programa en el
que se creen una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un menú le
permita al usuario hacer operaciones como ingresar, retirar y consultar saldo en la cuenta. El único
atributo público de la cuenta es el IBAN (String de 24 dígitos/letras). Otros atributos privados son saldo,
contadorIngresos, porcentajeComision y minimoComision, pero como son privados, no tenemos acceso a
ellos. Los métodos son:
- constructor (String Iban): se le pasa el nombre de la cuenta y fija saldo inicial a cero.
- void ingresar (float importe): aumenta el saldo. Si se hacen 3 ingresos consecutivos, sin ninguna
retirada en medio, se regala 0,7 euros al usuario.
- boolean retirar (float importe): reduce el saldo si es posible, no puede quedar negativo (devuelve si se
ha efectuado la retirada o no). Cada retirada tiene una comisión asociada.
- float getSaldo (): devuelve el saldo actual en la cuenta.
- setComision (float porcentaje, float impMinimo). Fija la comisión de retirada, para todas las cuentas.
- getPorcentajeComision() devuelve un float con el porcentaje de comisión a aplicar en retiradas.
- getMinimoComision() devuelve un float con el importe mínimo de comisión a aplicar en retiradas.*/
public class MLYt06e02 {

    public static void main(String[] args) {

        MovilPrepago telefono = new MovilPrepago(0034600600600L,0.20F,0.01F,0.15F,5F);

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("\tElegiste opción 1");
                    System.out.println("El saldo es: " + telefono.consultarSaldo());
                }
                case 2 -> {
                    System.out.println("\tElegiste opción 2");
                    System.out.print("Introduce el importe a recargar: ");
                    int num = teclado.nextInt();
                    telefono.recargar(num);
                }
                case 3 -> {
                    System.out.println("\tElegiste opción 3");
                    System.out.print("Introduce los segundos de la llamada: ");
                    int seg = teclado.nextInt();
                    telefono.efectuarLlamada(seg);
                }
                case 4 -> {
                    System.out.println("\tElegiste opción 4");
                    System.out.print("Introduce los MB usados: ");
                    int mb = teclado.nextInt();
                    telefono.navegar(mb);
                }
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Recargar saldo");
        System.out.println("3 Hacer llamada");
        System.out.println("4 Navegar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
