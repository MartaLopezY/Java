/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt10;

import java.util.Random;

/**
 *
 *
 * @author marta.lopezyanez
 */
public class Delfin_v2 implements Nadador_v2 {

    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat(40, 70);
        float seg = metros * 3600 / (velocidad * 1000);

        return seg;
    }

}
