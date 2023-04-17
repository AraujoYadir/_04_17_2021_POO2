package com.hedima.presentacion;

import com.hedima.modelo.Empleado;

import java.sql.SQLOutput;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado Usuario = new Empleado();
        Usuario.setNombre("Juan");
        Usuario.setSueldo(1000.0);
        System.out.println("La nomina de: " + Usuario.getNombre() + " es de: " + Usuario.calcularNominativo());




    }
}
