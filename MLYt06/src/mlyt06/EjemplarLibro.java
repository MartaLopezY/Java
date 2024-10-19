/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mlyt06;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 16/11/2022
 *
 * @author marta.lopezyanez Implementar una clase llamada EjemplarLibro que se
 * va a usar en una biblioteca y que tiene los siguientes atributos: - Título de
 * libro (se le pone en el momento del alta) - Fecha de adquisición (es la fecha
 * del sistema en el momento del alta) - Número de ejemplar: 1, 2, 3, etc. (de
 * un mismo libro, la biblioteca tiene varios ejemplares) - Prestado (sí /no).
 * Inicialmente no está prestado. Además, tiene los siguientes métodos: -
 * Constructor 1: cuando es el primer ejemplar de un determinado título, se le
 * pasa como parámetro solo el título del libro. El resto de datos los puede
 * calcular él. - Constructor 2: se le pasa como parámetro un libro y copia
 * todos sus atributos salvo el número de ejemplar que será 1 más el del libro
 * pasado. - Prestar (): si no está prestado lo marca como prestado y devuelve
 * true¸ si está prestado no hace nada y devuelve false. - Devolver (): si está
 * prestado lo marca como no prestado y devuelve true¸ si no está prestado no
 * hace nada y devuelve false. - toString (): Genera un String con el nombre, la
 * fecha entre paréntesis y el número de ejemplar entre corchetes. Este método
 * se usará para sacar por pantalla de forma cómoda los datos de un libro.
 */
public class EjemplarLibro {

    public String titulo;
    LocalDate fecha;
    public int numEjemplar;
    public boolean prestado = false;

    EjemplarLibro(String tit) {
        titulo = tit;
        fecha = LocalDate.now();
        numEjemplar = 1;
        prestado = false;
    }

    EjemplarLibro(EjemplarLibro lib) {
        titulo = lib.titulo;
        fecha = LocalDate.now();
        numEjemplar = lib.numEjemplar + 1;
        prestado = false;
    }

    public boolean Prestar() {
        if (prestado) {
            return false;
        }
        prestado = true;
        return true;
    }

    public boolean Devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    public void Convierte() {

        String datos = titulo + " (" + String.valueOf(fecha) + ") " + "[" + String.valueOf(numEjemplar) + "]";
        System.out.println(datos);

    }

}
