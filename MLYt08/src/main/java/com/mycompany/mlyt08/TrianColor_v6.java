/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt08;

/**
 * 19/1/2023
 *
 * @author marta.lopezyanez
 */
public class TrianColor_v6 extends Triangulo_v6 {

    private String color;

    TrianColor_v6(double b, double h, String e, String c) {
        super(b, h, e);
        color = e;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public void verColor() {

        System.out.println(color);
    }

}
