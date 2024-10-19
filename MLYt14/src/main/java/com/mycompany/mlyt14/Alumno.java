/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mlyt14;



/**
 * 
 */public class Alumno {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularNotaFinal() {
        return Math.round(nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5);
    }

    public String getNombre() {
        return nombre;
    }
 }