package com.angelodev.estructuradatos.modelos;

import java.util.Arrays;

public class Vector {
    private Alumno[] alumnos = new Alumno[100];
    private int totalDeAlumnos = 0;

    public void adicionar(Alumno alumno) {
        this.alumnos[totalDeAlumnos] = alumno;
        totalDeAlumnos++;
    }

    private boolean posicionValida(int posicion) {
        return posicion >= 0 && posicion <= totalDeAlumnos;
    }

    public void adiciona(int posicion, Alumno alumno) {
        if(!posicionValida(posicion)) {
            throw new IllegalArgumentException("posicion invalida");
        }
        for(int i = totalDeAlumnos - 1; i >= posicion; i-=1) {
            alumnos[i+1] = alumnos[i];
        }
        alumnos[posicion] = alumno;
        totalDeAlumnos++;
    }

    public Alumno obtener(int posicion) {
        if(!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("posición invalida");
        }
        return alumnos[posicion];
    }

    public void remove(int posicion) {
        for(int i = posicion; i < this.totalDeAlumnos; i++) {
            this.alumnos[i] = this.alumnos[i+1];
        }
        totalDeAlumnos--;
    }

    public boolean contiene(Alumno alumno) {
        for(int i = 0; i < totalDeAlumnos; i++) {
            if(alumno.equals(alumnos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanio() {
        //Devuelve la cantidad de alumnos
        return totalDeAlumnos;
    }

    public String toString() {
        //Facilitará la impresión
        return Arrays.toString(alumnos);
    }

    private boolean posicionOcupada(int posicion) {
        return posicion >= 0 && posicion < totalDeAlumnos;
    }



}
