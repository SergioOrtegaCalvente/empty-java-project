package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        /*
        int n3=1;
        System.out.println(n3);
        //n3++;
        System.out.println(n3++);
        //++n3;
        System.out.println(++n3);
        //--n3;
        System.out.println(--n3);
        //n3--;
        System.out.println(n3--);
        System.out.println(n3+5);
        */
        /*
        System.out.println(2+5-3*2);//1
        System.out.println(2*4*2/2);//8
        System.out.println(1/2);//0
        System.out.println(5*(1/2));//0
        System.out.println(5f*1/2);//2.5
        */
        try (Scanner leer = new Scanner(System.in)) {
            System.out.print("Introduce un numero: ");
            int parImpar=leer.nextInt();
            if ((parImpar % 2==0)) {
                System.out.println("Numero : "+parImpar+" es par");
            }else{
                System.out.println("Numero : "+parImpar+" es impar");
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear un lector de flujo del teclado");
        }
    }

}
