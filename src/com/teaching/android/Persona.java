package com.teaching.android;

public class Persona {
    private String nombre;
    private Double dinero;

    public Persona(String nombre, Double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDinero() {
        return dinero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dinero=" + dinero +
                '}';
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
}
