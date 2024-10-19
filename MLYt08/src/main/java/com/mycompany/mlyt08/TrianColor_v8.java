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
public class TrianColor_v8 extends Triangulo_v8 {

    private String color;

    TrianColor_v8(double b, double h, String e, String c,String n) {
        super(b, h, e,n);
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
