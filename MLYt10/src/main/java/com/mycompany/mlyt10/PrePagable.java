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
interface PrePagable {
void efectuarLlamada(int segundos);
boolean recargar(int importe);
float consultarSaldo();
@Override
String toString();

}
