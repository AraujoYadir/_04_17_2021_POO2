package com.hedima.modelo;

public class Empleado {
    private String nombre;
    private Double sueldo;

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public double calcularNominativo() {
        double nomina = sueldo - (sueldo*0.25);
        return nomina;

    }
}
