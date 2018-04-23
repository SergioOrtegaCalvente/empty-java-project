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
            if(metodos.menu()!=0){
                salir=false;
            }
        }while(salir);
    }

}
