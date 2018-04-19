package com.teaching.android;

import java.util.Scanner;

public class Metodos {
    private BancoPersonas personas;
    private Scanner leerS;
    private Scanner leerN;

    public Metodos() {
        this.personas=new BancoPersonas();
        this.leerS=new Scanner(System.in);
        this.leerN=new Scanner(System.in);
    }
    public void fallo(){
        System.out.println("Te has equivocado");
    }
    public void menu(){
        System.out.println("-------------------------------------------");
        System.out.println("1º Ingresa en el banco");
        System.out.println("2º Busca una persona");
        System.out.println("3º Mostrar a todos");
        System.out.println("4º Pagar a otro");
        System.out.println("5º Salir del progama");
    }
    public void ingresarBanco(){
        System.out.println("Ingresa Nombre:");
        String nombre=this.leerS.nextLine();
        System.out.println("Ingresa el dinero inicial");
        double dinero=this.leerN.nextDouble();
        personas.ingresarPersona(nombre,dinero);
    }
    public void mostrarPersonas(){
        System.out.println(personas.mostarTodo());
    }
    public void buscarPersonas(){
        System.out.println("Ingresa nombre:");
        System.out.println(this.personas.buscarPorNombre(this.leerS.nextLine()));
    }
    public void pagar(){
        System.out.println("ingresa nombre del recibe dinero");
        String recibeD=leerS.nextLine();
        System.out.println("Ingresa nombre de quien paga");
        String pagaD=leerS.nextLine();
        System.out.println("Ingresa cantidad dinero");
        double dinero=leerN.nextDouble();
        this.personas.Pago(recibeD,pagaD,dinero);
    }
}
