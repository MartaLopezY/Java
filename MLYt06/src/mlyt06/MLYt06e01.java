/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

/**
 * 03/11/2022
 *
 * @author marta.lopezyanez A partir de la clase MovilPrepago que te
 * proporcionará el profesor, haz un programa en el que se cree un teléfono con
 * unas características determinadas y luego ejecute una serie de actividades
 * como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se
 * va modificando el saldo.
 */
public class MLYt06e01 {

    public static void main(String[] args) {

        MovilPrepago telefono = new MovilPrepago (0034600600600L,0.20F,0.01F,0.15F,5F);
        System.out.println("El saldo es: " + telefono.consultarSaldo());
        telefono.recargar(10);
        System.out.println("El saldo es: " + telefono.consultarSaldo());
        telefono.efectuarLlamada(30);
        System.out.println("El saldo es: " + telefono.consultarSaldo());
        telefono.navegar(10);
    }

}
