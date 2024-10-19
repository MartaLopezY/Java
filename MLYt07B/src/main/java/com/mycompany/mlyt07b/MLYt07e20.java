/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt07b;

import java.util.Scanner;

/**
 *
 * @author marta.lopezyanez
 */
public class MLYt07e20 {

    static Factura factura;
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Nueva factura");
        System.out.println("Numero de factura:");
        int nF = teclado.nextInt();
        System.out.println("Numero de cliente:");
        int nC = teclado.nextInt();
        factura = new Factura(nF, nC);

        boolean salir = false;
        char opcion;
        do {
            System.out.println("\n\n---Gestión factura---");
            System.out.println("1)Mostrar factura\n2)Añadir linea\n3)Eliminar linea\n4)Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {

                case 1 ->
                    mostrarFactura();
                case 2 ->
                    añadirLinea();
                case 3 ->
                    eliminarLinea();
                case 4 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");

            }

        } while (salir == false);

    }
    private static void mostrarFactura(){
        factura.mostrarFactura();
    }
           private static void añadirLinea(){
    teclado.nextLine();
    System.out.println("Introduce descripción de la linea: ");
String descLinea=teclado.nextLine();
  System.out.println("Introduce precio unitario: ");
double precioUno=teclado.nextDouble();
   System.out.println("Introduce cantidad: ");
double cantidad=teclado.nextDouble(); 
System.out.println("Introduce descuento: ");
double descuento=teclado.nextDouble();
factura.añadirLinea(descLinea, precioUno,cantidad, descuento);
    }

    private static void eliminarLinea(){
        boolean resp;
        System.out.println("Introduce linea(la primera es la 1: ): ");
    int linea=teclado.nextInt();
    resp=factura.eliminarLinea(linea);
    if(resp) System.out.println("Borrado correcto");
    else System.out.println("No se encuentra la linea");
    
    } 
    
}
