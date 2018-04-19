package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public Circulo(){

    }
    public Circulo(int x, int y, int radio){
        this.centro=new Punto(x,y);
        this.radio=radio;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radio,2);
    }
    public double circunferencia(){
        return 2*Math.PI*this.radio;
    }
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro.toString() +
                ", radio=" + radio +
                '}';
    }
}
