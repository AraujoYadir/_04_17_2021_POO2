package com.hedima.presentacion;

import com.hedima.modelo.FechaEncapsulada;

public class MainFechaEncapsulada {
    public static void main(String[] args) {
        FechaEncapsulada fecha = new FechaEncapsulada();// Objeto que llamamos fecha y le asignamos los atirbutos de antes
        fecha.setAnio(1986);
        fecha.setMes(11);
        fecha.setDia(7);
        System.out.println("Año: " + fecha.getAnio());
        System.out.println( "Mes: " + fecha.getMes());
        System.out.println("Dia: "+ fecha.getDia());

    }
}
