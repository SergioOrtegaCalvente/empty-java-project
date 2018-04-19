package com.teaching.android;

import java.util.Scanner;

public class Metodos {
    private BancoPersonas personas;
    private Scanner leerS;
    private Scanner leerN;
    private Punto punto;

    public Metodos() {
        this.personas=new BancoPersonas();
        this.leerS=new Scanner(System.in);
        this.leerN=new Scanner(System.in);
        this.punto=new Punto();
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
        System.out.println("5º Cosas con punto");
        System.out.println("6º Salir del progama");
    }
    /*
    * Apartir de aqui es sobre punto
    * */
    public void punto(){
        System.out.println("Calcular los puntos de distancia");
        System.out.println("1ª ingresa los puntos");
        System.out.println("2ª Con punto ya existente");
        System.out.println("3º Mostrar punto");
        switch (leerN.nextInt()){
            case 1:
                System.out.println("ingresa X");
                int x=leerN.nextInt();
                System.out.println("ingresa Y");
                int y=leerN.nextInt();
                distancia(x,y);
                this.punto=new Punto(x,y);
                break;
            case 2:
                distancia(this.punto);
                break;
            case 3:
                System.out.println(punto.toString());
        }
    }
    public void distancia(int x, int y){
        int d=(int)Math.sqrt(Math.pow((Math.pow(x,2)-Math.pow(x,1)),2)+Math.pow((Math.pow(y,2)-Math.pow(y,1)),2));
        System.out.println("La distincias es "+d);
    }
    public void distancia(Punto p){
        int d=(int)Math.sqrt(Math.pow((Math.pow(p.getX(),2)-Math.pow(p.getX(),1)),2)+Math.pow((Math.pow(p.getY(),2)-Math.pow(p.getY(),1)),2));
        System.out.println("La distincias es "+d);
    }
    /*
    * Todo lo de aqui abajo es sobre Personas
    * */
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
