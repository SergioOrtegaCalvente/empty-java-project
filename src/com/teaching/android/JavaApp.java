package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        boolean salir=true;
        Scanner leer=new Scanner(System.in);
        do{
            metodos.menu();
            switch (leer.nextInt()){
                case 1:
                    metodos.ingresarBanco();
                    break;
                case 2:
                    metodos.buscarPersonas();
                    break;
                case 3:
                    metodos.mostrarPersonas();
                    break;
                case 4:
                    metodos.pagar();
                    break;
                case 5:
                    salir=false;
                    break;
                    default:
                        metodos.fallo();
                        break;
            }
        }while(salir);
    }

}
