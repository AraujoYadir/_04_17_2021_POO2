package com.hedima.presentacion;

import com.hedima.modelo.Figura;

public class MainFigura {
    public static void main(String[] args) {
        Figura objeto = new Figura();
        objeto.setX(2);
        objeto.setY(3);
        System.out.println(objeto.mostrarPocision());

    }
}
