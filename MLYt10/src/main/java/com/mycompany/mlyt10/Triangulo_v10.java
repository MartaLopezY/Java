/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

/**
 
 *
 * @author marta.lopezyanez 
 */
public class Triangulo_v10 extends Figura2D_v10 {

    public String estilo;

    Triangulo_v10(Triangulo_v10 trian) {
        super(trian.getAncho(), trian.getAlto(),trian.getNombre());
        estilo = trian.estilo;
    }

    Triangulo_v10(double b, double h, String e,String n) {
        super(b, h,n);
        estilo = e;
    }

    Triangulo_v10() {
        super();
        estilo = null;
    }

    Triangulo_v10(double l,String n) {
        super(l,n);
        estilo = "igualBaseAltura";
    }

    @Override
    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }
  @Override
    public double calcularPerimetro(){
    
    return(getAncho()*3);
    }
    public void verEstilo() {

        System.out.println(estilo);
    }

}
