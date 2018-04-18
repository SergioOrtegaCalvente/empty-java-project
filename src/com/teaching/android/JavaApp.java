package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.ingreso("Pepe",2000.0);
        metodos.ingreso("Paco",54000.20);
        System.out.println("Pago de paco a pepe");
        System.out.println(metodos.mostar("Pepe"));
        metodos.pagar("Pepe","Paco",200);
        System.out.println("Pago realizado");
        System.out.println(metodos.mostar("Pepe"));
    }

}
