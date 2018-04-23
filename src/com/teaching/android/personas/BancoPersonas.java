package com.teaching.android.personas;

import java.util.ArrayList;

public class BancoPersonas {
    private ArrayList<Persona> persona;
    private Persona p;

    public BancoPersonas() {
        this.persona=new ArrayList<Persona>();
    }

    public void ingresarPersona(String persona, double dinero){
        this.p=new Persona(persona,dinero);
        this.persona.add(p);
    }
    public String buscarPorNombre(String nombre){
        for(int i=0;i<this.persona.size();i++){
            if(persona.get(i).getNombre().equalsIgnoreCase(nombre)){
                return persona.get(i).toString();
            }
        }
        return "No existe esa persona";
    }
    public String mostarTodo(){
        String guardar="";
        for (int i=0; i<this.persona.size();i++){
            guardar=guardar+ this.persona.get(i).toString()+"\n";
        }
        return guardar;
    }
    private int saberID(String nombre){
        int id=0;
        for (int i=0;i<this.persona.size();i++){
            if(this.persona.get(i).getNombre().equalsIgnoreCase(nombre)){
                id=i;
                return id;
            }
        }
        return -1;
    }
    public void Pago(String nombreR,String nombreP,double dinero){
        int idR=saberID(nombreR);
        int idP=saberID(nombreP);
        if(this.persona.get(idP).getDinero()-dinero>=0){
            this.persona.get(idR).setDinero(dinero+this.persona.get(idR).getDinero());
            this.persona.get(idP).setDinero(this.persona.get(idP).getDinero()-dinero);
        }else{
            if(idP!=-1 || idR!=-1) {
                System.out.println("La persona " + nombreP + " No puede pagar tanto dinero su saldo es " + this.persona.get(idP).getDinero() + "\n" +
                        "y quiere pagar " + dinero);
            }else{
                System.out.println("El pagador no existe o quien recibe el dinero");
            }
        }
    }

}
