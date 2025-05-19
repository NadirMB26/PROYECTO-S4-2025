
package com.raven.component;

import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

public class NodoCita {
    
    public Cita cita;
    private NodoCita siguiente;
    private NodoCita anterior;
    
    public NodoCita(Cita cita){
        this.cita = cita;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public NodoCita(Cita cita, NodoCita siguiente,NodoCita anterior){
        this.cita = cita;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    public Cita getCita(){
        return cita;
    }
    
    public void setCita(Cita cita){
        this.cita = cita;
    }
    
    public NodoCita getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(NodoCita siguiente){
        this.siguiente = siguiente;
    }
    
    public NodoCita getAnterior(){
        return anterior;
    }
    
    public void setAnterior(NodoCita anterior){
        this.anterior = anterior;
    }
}
