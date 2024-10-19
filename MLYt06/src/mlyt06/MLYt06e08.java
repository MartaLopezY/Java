/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.util.Scanner;

/**
 * 16/11/2022
 *
 * @author marta.lopezyanez Implementar una clase llamada EjemplarLibro que se
 * va a usar en una biblioteca. Haz un main() que cree 4 libros (probando ambos
 * constructores), que realice algún préstamo y devolución, y finalmente muestre
 * los libros -con toString()-.
 */
public class MLYt06e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String titulo1 = "El Quijote";
        String titulo2 = "La Celestina";
        boolean prestado, devuelto;
        EjemplarLibro libro1 = new EjemplarLibro(titulo1);
        EjemplarLibro libro2 = new EjemplarLibro(libro1);
        EjemplarLibro libro3 = new EjemplarLibro(titulo2);
        EjemplarLibro libro4 = new EjemplarLibro(libro3);

        prestado = libro2.Prestar();
        if (prestado) {
            System.out.println("El libro ha sido prestado");
        }
        devuelto = libro2.Prestar();
        if (devuelto) {
            System.out.println("El libro ha sido devuelto");
        }
        libro1.Convierte();
        libro2.Convierte();
        libro3.Convierte();
        libro4.Convierte();
    }

}
