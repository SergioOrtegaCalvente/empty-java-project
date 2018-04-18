package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        /*
        //Adivinar numero sin bucle
        try (Scanner leer = new Scanner(System.in)) {
            Random azar= new Random();
            int numeroAzar= azar.nextInt(10)+1;
            System.out.println("Numero secreto es: "+numeroAzar);
            System.out.println("Introduce un numero a adivinar: ");
            int adivinar=leer.nextInt();
            if (adivinar==numeroAzar) {
                System.out.println("Acertaste!!");
            }else{
                if(numeroAzar>adivinar){
                    System.out.println("Numero es menor y fallaste!!");
                }else{
                    System.out.println("Numero es mayor y fallaste!!");
                }
                System.out.println("Introduce un numero a adivinar: ");
                adivinar=leer.nextInt();
                if(adivinar==numeroAzar){
                    System.out.println("Acertaste!!");
                }else{
                    if(numeroAzar>adivinar){
                        System.out.println("Numero es menor y fallaste!!");
                    }else{
                        System.out.println("Numero es mayor y fallaste!!");
                    }
                    System.out.println("Introduce un numero a adivinar: ");
                    adivinar=leer.nextInt();
                    if(adivinar==numeroAzar){
                        System.out.println("Acertaste!!");
                    }else{
                        System.out.println("Te quedaste sin intentos!!");
                        System.out.println("El numero correcto era: "+adivinar);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear un lector de flujo del teclado o insertado una letra");
        }
        */
        int j=0;
        for (int i=1;i<=20;i++){
            System.out.println(i+"º numero par es: "+j);
            j=j+2;
        }
        /*

        */
    }

}
