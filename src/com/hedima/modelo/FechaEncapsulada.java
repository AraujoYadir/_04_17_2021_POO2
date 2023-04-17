package com.hedima.modelo;
import com.hedima.modelo.FechaEncapsulada;
public class FechaEncapsulada {
//Atributos
    private int anio;
    private int mes;
    private int dia;
//Constructor
    public FechaEncapsulada (int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public FechaEncapsulada() {

    }

    //getter y Setter
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>=1 && mes<=12) {
            this.mes = mes;}
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
