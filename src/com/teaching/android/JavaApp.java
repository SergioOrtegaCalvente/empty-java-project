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
        try {
            Scanner leer = new Scanner(System.in);
            Random azar= new Random();
            int numeroAleatorio= azar.nextInt(10);
            int contador = 0;
            int numeroElegido;
            System.out.println("Numero acertar es "+numeroAleatorio);
            do{
                System.out.println("Selecciona el numero para ver si aciertas");
                numeroElegido=leer.nextInt();
                if(numeroElegido==numeroAleatorio){
                    System.out.println("Acertaste!!!");
                    contador=3;
                }else{
                    if(numeroElegido>numeroAleatorio){
                        if(contador<3) {
                            contador++;
                            System.out.println("Numero es menor y fallaste!!");
                        }else{
                            System.out.println("Te quedaste sin intentos");
                            break;
                        }
                    }else{
                        contador++;
                        if(contador<3) {
                            System.out.println("Numero es mayor y fallaste!!");
                        }else{
                            System.out.println("Te quedaste sin intentos");
                            break;
                        }
                    }
                }
            }while(contador<3);
        }catch (Exception e){
            System.out.println("No se ha podido leer el flujo del teclado o has escrito una letra");
        }
        /*

        */
    }

}
