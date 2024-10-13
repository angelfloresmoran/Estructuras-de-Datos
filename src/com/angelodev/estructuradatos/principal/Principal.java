package com.angelodev.estructuradatos.principal;

import com.angelodev.estructuradatos.modelos.Alumno;
import com.angelodev.estructuradatos.modelos.Vector;

public class Principal {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Juan");
        Alumno a2 = new Alumno("Jose");
        Alumno a3 = new Alumno("Danilo");
        Vector lista = new Vector();

        lista.adicionar(a1);
        lista.adicionar(a2);
        System.out.println(lista);

        System.out.println(lista.tamanio());
        Alumno x = lista.obtener(1);
        System.out.println(x);

        lista.adiciona(1, a3);
        System.out.println(lista.contiene(a3));
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);

    }
}
