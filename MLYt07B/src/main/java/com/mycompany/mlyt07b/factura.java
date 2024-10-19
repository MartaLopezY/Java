/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mlyt07b;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author marta.lopezyanez
 */
public class Factura {

    private int id;
    private LocalDate fecha;
    private int numCliente;
    private static final double IVA = 0.21d;
    private ArrayList<LineaFactura> lineasFactura;
    private double importeTotalFactura;

    Factura(int id, int nC) {

        this.id = id;
        this.fecha = LocalDate.now();
        this.numCliente = nC;
        lineasFactura = new ArrayList<>();
        this.importeTotalFactura = 0;
    }

    public void añadirLinea(String d, double pU, double cU, double pD) {
        lineasFactura.add(new LineaFactura(d, pU, cU, pD));
        recalcularTotalFactura();

    }

    public boolean eliminarLinea(int nL) {
        int numLinea = nL - 1;
        if (numLinea < 0 || numLinea >= lineasFactura.size()) {
            return false;
        }
        lineasFactura.remove(numLinea);
        recalcularTotalFactura();
        return true;
    }

    private void recalcularTotalFactura() {
        this.importeTotalFactura = 0;
        for (LineaFactura lf : this.lineasFactura) {
            this.importeTotalFactura += lf.getImporteTotalLinea();
        }
        this.importeTotalFactura += this.importeTotalFactura * Factura.IVA;

    }

    public void mostrarFactura() {
        System.out.println("Fecha:" + this.fecha);
        System.out.println("Num cliente:" + this.numCliente);
        for (LineaFactura lf : this.lineasFactura) {
            System.out.println(lf.toString());
        }
        System.out.println("Total Factura:" + this.importeTotalFactura);
    }

}

class LineaFactura {

    private String descrip;
    private double precioUnitario;
    private double cantUnidades;
    private double porcDescuento;
    private double importeTotalLinea;

    public LineaFactura(String descrip, double precioUnitario, double cantUnidades, double porcDescuento) {

        this.descrip = descrip;
        this.precioUnitario = precioUnitario;
        this.cantUnidades = cantUnidades;
        this.porcDescuento = porcDescuento;
        this.importeTotalLinea = precioUnitario * cantUnidades * (1 - porcDescuento);

    }

    public double getImporteTotalLinea() {
        return importeTotalLinea;
    }

    @Override
    public String toString() {
        String linea = String.format("%s[%.2f]-->%.2f", descrip, cantUnidades, importeTotalLinea);
        return linea;
    }

}
