/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;



/**
 *
 *
 * @author marta.lopezyanez
 */
public class BallenaAzul implements Nadador {

    public static int edad;

    public BallenaAzul(int e) {
        edad = e;
    }

    @Override
    public float nadar(float metros) {
        float seg;
        if (edad > 5) {
            seg = metros * 3600 / (10 * 1000);
        } else {
            seg = metros * 3600 / (13 * 1000);
        }
        return seg;
    }

}
