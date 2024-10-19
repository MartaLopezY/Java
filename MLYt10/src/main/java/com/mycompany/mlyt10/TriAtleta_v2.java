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
public class TriAtleta_v2 implements Nadador_v2, Ciclista_v2, Saltador_v2 {


    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat(40, 70);
        float seg = metros * 3600 / (velocidad * 1000);
        return seg;
    }

    @Override
    public float recorrer(float km, String tipoTerreno) {
        float rec = 0;
        if (tipoTerreno.equals("carretera")) {
            rec = km * 3600 / 25;
        } else {
            rec = km * 3600 / 15;
        }
        return rec;
    }

    @Override
    public float saltarAltura() {
        Random r = new Random();
        float a = r.nextFloat(30, 40);
        return a;

    }
}
