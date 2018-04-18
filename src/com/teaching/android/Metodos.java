package com.teaching.android;

import java.util.ArrayList;

public class Metodos {
    private ArrayList<Persona> personas;

    public Metodos() {
        this.personas=new ArrayList();
    }
    public void ingreso(String a, Double b){
        Persona p=new Persona(a,b);
        aniadirPersona(p);
    }
    private void aniadirPersona(Persona a){
        personas.add(a);
    }
    public void pagar(String nombreRecibeDinero, String nombrePagador, double dineroPagar){
        int idRecibe=saberId(nombreRecibeDinero);
        int idPagador=saberId(nombrePagador);
        realizarPago(idRecibe,idPagador,dineroPagar);
    }
    private int saberId(String a){
        int id=0;
        for(int i=0;i<this.personas.size();i++){
            if(personas.get(i).getNombre().equalsIgnoreCase(a)){
                id=i;
            }
        }
        return id;
    }
    private void realizarPago(int idRecibe, int idPaga,double pago){
        personas.get(idRecibe).setDinero(personas.get(idRecibe).getDinero()+pago);
        personas.get(idPaga).setDinero(personas.get(idPaga).getDinero()-pago);
    }
    public String mostar(String a){
        return personas.get(saberId(a)).toString();

    }
}
