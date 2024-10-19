/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

/**

 *
 * @author marta.lopezyanez
 */
public class Rectangulo_v10 extends Figura2D_v10 {

    Rectangulo_v10(double b, double h, String n) {
        super(b, h, n);

    }

    @Override
    public double area() {
        double a = (getAncho() * getAlto());
        return a;
    }
    @Override
    public double calcularPerimetro(){
    
    return(getAncho()*2 + getAlto()*2);
    }
    public boolean esCuadrado() {
        if (getAncho() == getAlto()) {
            return true;
        } else {
            return false;
        }
    }

}
